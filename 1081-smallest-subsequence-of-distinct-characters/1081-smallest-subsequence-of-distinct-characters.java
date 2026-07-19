class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];
        Stack<Character> stack = new Stack<>();

        // count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]--;

            if (used[idx]) continue;

            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            used[idx] = true;
        }

        // build result
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);

        return sb.toString();

    }
}