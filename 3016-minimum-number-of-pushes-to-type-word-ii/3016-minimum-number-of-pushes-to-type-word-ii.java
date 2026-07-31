class Solution {
    public int minimumPushes(String word) {
        String s = f(word);
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch))
                continue;

            if (map.size() < 8) {
                map.put(ch, 1);
            } else if (map.size() < 16) {
                map.put(ch, 2);
            } else if (map.size() < 24) {
                map.put(ch, 3);
            } else {
                map.put(ch, 4);
            }
        }
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int ans = 0;

        for (Character key : map.keySet()) {
            ans += map.get(key) * freq[key - 'a'];
        }
        return ans;
    }

    public String f(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));
        StringBuilder ans = new StringBuilder();

        for (char ch : chars) {
            for (int i = 0; i < freq.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}