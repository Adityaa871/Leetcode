class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> ll = new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i=2; i<nums.length; i++){
            if(l1.get(l1.size()-1) > l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }
        for(int x : l1){
            ll.add(x);
        }
        for(int x : l2){
            ll.add(x);
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = ll.get(i);
        }
        return nums;
    }
}