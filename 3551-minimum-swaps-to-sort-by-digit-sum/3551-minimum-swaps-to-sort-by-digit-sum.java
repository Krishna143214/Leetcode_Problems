import java.util.*;

class Solution {

    static int sum(int a) {
        int s = 0;
        while (a > 0) {
            s += a % 10;
            a /= 10;
        }
        return s;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sum(nums[i]);
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (sum(nums[a[1]]) != sum(nums[b[1]]))
                return sum(nums[a[1]]) - sum(nums[b[1]]);
            return nums[a[1]] - nums[b[1]];
        });

        boolean[] vis = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || arr[i][1] == i)
                continue;

            int j = i;
            int cycle = 0;

            while (!vis[j]) {
                vis[j] = true;
                j = arr[j][1];
                cycle++;
            }

            swaps += cycle - 1;
        }

        return swaps;
    }
}