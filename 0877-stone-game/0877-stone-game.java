class Solution {
    public boolean stoneGame(int[] nums) {
        int n = nums.length;
        return helper(nums, 0, n-1, new Integer[n][n]) >= 0;
    }
    public int helper(int[] nums, int l, int r, Integer [][] dp){
        if(l == r) return nums[l];

        if(dp[l][r] != null) return dp[l][r];
        int left = nums[l] - helper(nums, l+1, r, dp);
        int right = nums[r] - helper(nums, l, r-1, dp);
        
        dp[l][r] =  Math.max(left, right);
        return dp[l][r];
    }
}