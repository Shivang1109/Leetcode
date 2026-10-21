
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Check if already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;

        // Length 2 cannot be changed if unsorted
        if (n == 2) return -1;

        char mn = 'z', mx = 'a';

        for (int i = 0; i < n; i++) {
            mn = (char) Math.min(mn, s.charAt(i));
            mx = (char) Math.max(mx, s.charAt(i));
        }

        // One operation is enough
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }

        // Check whether min or max occurs inside
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx) {
                return 2;
            }
        }

        return 3;
    }
}
