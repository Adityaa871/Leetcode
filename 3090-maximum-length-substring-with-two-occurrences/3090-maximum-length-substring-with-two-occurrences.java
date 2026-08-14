class Solution {
    public int maximumLengthSubstring(String s) {
        int k =2;
       int ans = 0;
       char [] nums = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int l =0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])> k){
                map.put(nums[l], map.get(nums[l])-1);
                l++;
            }
            if(map.get(nums[i]) <= k){
                ans = Math.max(ans, i-l+1);
            }
        }
        return ans; 
    }
}