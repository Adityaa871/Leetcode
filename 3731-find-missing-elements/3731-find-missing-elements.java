class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
            if(x > max){
                max = x;
            }
            if(x < min){
                min = x;
            }
        }

        for(int i=min; i<=max; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }

        
        return res;
    }
}