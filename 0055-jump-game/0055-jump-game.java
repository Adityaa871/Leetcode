class Solution {
    public boolean canJump(int[] nums) {
        int goal = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(i > goal) return false;
            goal = Math.max(goal, nums[i] + i);
        } 
        return true;
    }


}