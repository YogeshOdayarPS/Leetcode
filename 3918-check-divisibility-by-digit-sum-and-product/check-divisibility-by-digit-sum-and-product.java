class Solution {
    public boolean checkDivisibility(int n) {
    String s = String.valueOf(n);
        char[] arr = s.toCharArray();

        int sum = 0;
    int prod = 1;

        for (char c : arr) {
            int dig = c - '0';

            sum += dig;
            prod *= dig;
        }

        int total = sum + prod;

        if(n % total == 0){
            return true;
        }
        return false;
    }
}