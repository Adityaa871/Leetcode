class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stk.push(0);
            }else{
                int v = stk.pop();
                int top = stk.pop();

                stk.push(top + Math.max(2*v, 1));
            }
        }
        return stk.pop();
    }
}