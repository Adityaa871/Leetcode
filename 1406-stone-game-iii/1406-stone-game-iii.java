class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int next = 0, next2next = 0, next2next2next = 0;
        for(int i = n - 1; i >= 0; i--){
            int curr = stoneValue[i] - next;
            if(i + 1 < n){
                curr = Math.max(curr, stoneValue[i] + stoneValue[i+1] - next2next);
            }
            if(i + 2 < n){
                curr = Math.max(curr, stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - next2next2next);
            }
            next2next2next = next2next;
            next2next = next;
            next = curr;


        }

        if( next  > 0){
            return "Alice";
        }else if(next < 0){
            return "Bob";
        }


        return "Tie";
    }
}