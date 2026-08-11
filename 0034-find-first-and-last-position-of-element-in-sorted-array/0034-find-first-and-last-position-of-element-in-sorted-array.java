class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = {-1,-1};
         int leftIndex = lbs(nums, target);
        
       
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return arr; 
        }
        
        arr[0] = leftIndex;
        arr[1] = ubs(nums, target) - 1;
        
        return arr;
    } 
    public int lbs(int [] nums, int target){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = n;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(nums[mid] >= target){
                ans = mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        return ans;

    }
    public int ubs(int [] nums, int target){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = n;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(nums[mid] > target){
                ans = mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        return ans;

    }
}