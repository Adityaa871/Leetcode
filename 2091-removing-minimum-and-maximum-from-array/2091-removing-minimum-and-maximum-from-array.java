class Solution {
    public int minimumDeletions(int[] nums) {
        int i1 = 0;
        int i2 = 0;
        int min=Integer.MAX_VALUE, max =Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] < min){
                min = nums[i];
                i1 = i;
            }
            if(nums[i] > max){
                max = nums[i];
                i2 = i;
            }
        }
        int left = Math.min(i1,i2);
        int right = Math.max(i1,i2);

        int ans = (left +1 ) + (n-right);
        int f = right+1;
        int b = n-left;
        return Math.min(ans, Math.min(f,b));

    }
}