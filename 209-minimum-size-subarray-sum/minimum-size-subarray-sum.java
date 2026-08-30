class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE,left=0,sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                int ele=nums[left];
                min=Math.min(min,right-left+1);
                sum-=ele;
                left++;   
            }
            
        }
        return min == Integer.MAX_VALUE?0:min;
    }
}