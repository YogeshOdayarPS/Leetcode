class Solution {

    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();
        int half = n / 2;

        // Count characters in s
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Check palindrome possibility
        int odd = 0;
        char middle = 0;

        for (int i = 0; i < 26; i++) {

            if (count[i] % 2 == 1) {
                odd++;
                middle = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        // Characters available for left half
        int[] halfCount = new int[26];

        for (int i = 0; i < 26; i++) {
            halfCount[i] = count[i] / 2;
        }

        /*
         * First check whether target's first half
         * can be made exactly.
         */
        int[] temp = halfCount.clone();
        boolean possible = true;

        for (int i = 0; i < half; i++) {

            int x = target.charAt(i) - 'a';

            if (temp[x] == 0) {
                possible = false;
                break;
            }

            temp[x]--;
        }

        // If possible, make palindrome
        // and check whether it is greater than target.
        if (possible) {

            char[] left = new char[half];

            for (int i = 0; i < half; i++) {
                left[i] = target.charAt(i);
            }

            String answer = makePalindrome(left, middle, odd);

            if (answer.compareTo(target) > 0) {
                return answer;
            }
        }

        /*
         * Find the smallest left half
         * that is greater than target's left half.
         */

        for (int i = half - 1; i >= 0; i--) {

            // Rebuild remaining characters
            int[] remaining = halfCount.clone();

            boolean prefixPossible = true;

            // Keep target[0 ... i-1] equal
            for (int j = 0; j < i; j++) {

                int x = target.charAt(j) - 'a';

                if (remaining[x] == 0) {
                    prefixPossible = false;
                    break;
                }

                remaining[x]--;
            }

            if (!prefixPossible) {
                continue;
            }

            // Current target character
            int current = target.charAt(i) - 'a';

            // Try the smallest character bigger than target[i]
            for (int j = current + 1; j < 26; j++) {

                if (remaining[j] > 0) {

                    char[] left = new char[half];

                    // Copy target prefix
                    for (int k = 0; k < i; k++) {
                        left[k] = target.charAt(k);
                    }

                    // Put bigger character
                    left[i] = (char) ('a' + j);
                    remaining[j]--;

                    // Fill remaining characters smallest first
                    int pos = i + 1;

                    for (int k = 0; k < 26; k++) {

                        while (remaining[k] > 0) {
                            left[pos] = (char) ('a' + k);
                            pos++;
                            remaining[k]--;
                        }
                    }

                    return makePalindrome(left, middle, odd);
                }
            }
        }

        return "";
    }


    public String makePalindrome(
            char[] left,
            char middle,
            int odd) {

        String a = new String(left);

        String b = new StringBuilder(a)
                .reverse()
                .toString();

        if (odd == 1) {
            return a + middle + b;
        }

        return a + b;
    }
}