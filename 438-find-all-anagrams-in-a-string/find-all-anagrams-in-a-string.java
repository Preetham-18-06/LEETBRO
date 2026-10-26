
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Count characters in p
        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        // Build the first window
        for (int i = 0; i < m; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pFreq, windowFreq)) {
            result.add(0);
        }

        // Slide the window
        for (int i = m; i < n; i++) {
            // Remove the character leaving the window
            windowFreq[s.charAt(i - m) - 'a']--;

            // Add the character entering the window
            windowFreq[s.charAt(i) - 'a']++;

            // Compare frequencies
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - m + 1);
            }
        }

        return result;
    }
}
