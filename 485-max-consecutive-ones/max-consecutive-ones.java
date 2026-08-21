class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int x:nums)
        {
            if(x==1)
            {
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else
            count=0;
        }
        return maxCount;
    }
}