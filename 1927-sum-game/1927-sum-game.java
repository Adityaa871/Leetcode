class Solution {
    public boolean sumGame(String num) {

        // agar left and right side ka sum equal nhi ho skta then we return true and alice wins otherwise bob wins
        int n = num.length();
        int lc = 0;
        int rc = 0;
        int l=0, r=0;
        for(int i=0; i<n/2; i++){
            char ch = num.charAt(i);
            if(ch == '?'){
                lc++;
            }else{
                l += ch - '0';
            }
        }
        for(int i=n/2; i<n; i++){
            char ch = num.charAt(i);
            if(ch == '?'){
                rc++;
            }else{
                r += ch - '0';
            }
        }
        if( (lc + rc) % 2 == 1){
            return true;
        }
        int diff = l - r;
        int target = (rc -lc) / 2*9;
        if(lc+rc == 0){
            return l != r;
        }

        if(diff == target){
            return false;
        }
        return true;
    }
}