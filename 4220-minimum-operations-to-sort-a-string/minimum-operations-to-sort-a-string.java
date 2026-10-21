
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;

        char smallest = s.charAt(0);
        char largest = s.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if (c < s.charAt(i - 1)) {
                sorted = false;
            }

            smallest = (char) Math.min(smallest, c);
            largest = (char) Math.max(largest, c);
        }

        if (sorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        if (s.charAt(0) == smallest ||
            s.charAt(n - 1) == largest) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == smallest ||
                s.charAt(i) == largest) {
                return 2;
            }
        }

        return 3;
    }
}
