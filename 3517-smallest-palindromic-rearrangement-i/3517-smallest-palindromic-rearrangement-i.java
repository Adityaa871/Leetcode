class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n == 1)
            return s;
        if (n % 2 == 0) {
            char[] arr = new char[n / 2];

            for (int i = 0; i < n / 2; i++) {
                arr[i] = s.charAt(i);
            }
            Arrays.sort(arr);
            String s1 = new String(arr);
            String rev = new StringBuilder(s1).reverse().toString();

            s1 += rev;
            return s1;
        }
        char[] arr = new char[n / 2];

        for (int i = 0; i < n / 2; i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr);

        String s1 = new String(arr);
        char mid = s.charAt(n / 2);
        String rev = new StringBuilder(s1).reverse().toString();

        return s1 + mid + rev;
    }

}
