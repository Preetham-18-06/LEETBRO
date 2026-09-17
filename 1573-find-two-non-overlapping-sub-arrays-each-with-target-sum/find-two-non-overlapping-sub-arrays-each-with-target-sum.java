class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;

        // best[i] = shortest valid subarray ending at or before i
        int[] best = new int[n];
        Arrays.fill(best, INF);

        int left = 0;
        int sum = 0;
        int answer = INF;
        int minLength = INF;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left++];
            }

            if (sum == target) {
                int length = right - left + 1;

                // Combine with a previous non-overlapping subarray
                if (left > 0 && best[left - 1] != INF) {
                    answer = Math.min(answer, length + best[left - 1]);
                }

                minLength = Math.min(minLength, length);
            }

            best[right] = minLength;
        }

        return answer == INF ? -1 : answer;
    }
}