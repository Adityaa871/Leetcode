class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<n; i++){
            map.add(nums[i]);
        }

        int sum = nums[0];
        for(int i=1; i<n; i++ ){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }else{
                break;
            }
        }
        while(map.contains(sum)){
            sum++;
        }
        return sum;
    }
}