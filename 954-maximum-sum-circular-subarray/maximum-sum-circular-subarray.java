class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int currentMin=nums[0];
       int min=nums[0];
       int currentMax=nums[0];
       int max=nums[0];

       int total=nums[0];

       for(int i=1;i<nums.length;i++)
       {
        currentMax=Math.max(nums[i],currentMax+nums[i]);
        max=Math.max(currentMax,max);

        currentMin=Math.min(nums[i],currentMin+nums[i]);
        min=Math.min(min,currentMin);

        total+=nums[i];
       }
       if(max<0)
       return max;

       int circularMax=total-min;
       int ans=Math.max(max,circularMax);

       return ans;
    }
}