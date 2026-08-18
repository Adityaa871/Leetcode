class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[100];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        if (k == 1) {
            int max = -1;

            for (int x : nums) {
                if (freq[x] == 1) {
                    max = Math.max(max, x);
                }
            }

            return max;
        } else if (k == nums.length) {
            int max = -1;
            for (int x : nums) {
                if ( x > max) {
                    max = x;
                }
            }
            return max;
        } else if (k < nums.length && k > 1) {
            int ans = -1;

            if (freq[nums[0]] == 1) {
                ans = Math.max(ans, nums[0]);
            }

            if (freq[nums[n - 1]] == 1) {
                ans = Math.max(ans, nums[n - 1]);
            }
            return ans;
        }
        return -1;
    }
}