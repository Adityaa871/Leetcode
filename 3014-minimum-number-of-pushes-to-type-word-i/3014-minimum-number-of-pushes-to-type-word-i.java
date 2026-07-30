class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int n1 = n/8;
        int n2 = n%8;
        int ans = 0;
        for(int i =1; i<=n1; i++){
            ans += 8 * i;
        }
        ans += n2 * (n1+1);
        return ans;
    }
}