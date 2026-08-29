import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }

        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        int i = 0;

        while (i < n) {
            int j = i;

            while (j + 1 < n && a[j + 1][0] - a[j][0] <= limit)
                j++;

            ArrayList<Integer> list = new ArrayList<>();

            for (int k = i; k <= j; k++)
                list.add(a[k][1]);

            Collections.sort(list);

            for (int k = 0; k < list.size(); k++)
                nums[list.get(k)] = a[i + k][0];

            i = j + 1;
        }

        return nums;
    }
}