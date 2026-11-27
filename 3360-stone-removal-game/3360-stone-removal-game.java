class Solution {
    public boolean canAliceWin(int n) {
        int num = 10;
        boolean flag = false;
        while(n >= num){
            n = n - num;
            flag = !flag;
            num--;
        }
        return flag;
    }
}