
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int m = queries.length;
        int[] result = new int[m];

        // Sort logs based on request time
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        // Store queries with their original indices
        int[][] q = new int[m][2];

        for (int i = 0; i < m; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        // Sort queries based on time
        Arrays.sort(q, (a, b) -> Integer.compare(a[0], b[0]));

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int active = 0;

        for (int i = 0; i < m; i++) {

            int start = q[i][0] - x;
            int end = q[i][0];

            // Add logs that enter the window
            while (right < logs.length && logs[right][1] <= end) {

                int id = logs[right][0];

                map.put(id, map.getOrDefault(id, 0) + 1);

                if (map.get(id) == 1) {
                    active++;
                }

                right++;
            }

            // Remove logs that fall before the window
            while (left < right && logs[left][1] < start) {

                int id = logs[left][0];

                map.put(id, map.get(id) - 1);

                if (map.get(id) == 0) {
                    map.remove(id);
                    active--;
                }

                left++;
            }

            // Servers with zero requests
            result[q[i][1]] = n - active;
        }

        return result;
    }
}
