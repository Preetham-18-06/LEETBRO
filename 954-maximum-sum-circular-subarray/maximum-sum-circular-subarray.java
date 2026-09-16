class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxSum = nums[0];
        int maxCurrent = nums[0];

        int minSum = nums[0];
        int minCurrent = nums[0];

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];

            if (i > 0) {
                maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
                maxSum = Math.max(maxSum, maxCurrent);

                minCurrent = Math.min(nums[i], minCurrent + nums[i]);
                minSum = Math.min(minSum, minCurrent);
            }
        }

        // All elements are negative
        if (maxSum < 0)
            return maxSum;

        // Maximum of normal and circular subarray
        return Math.max(maxSum, total - minSum);
    }
}