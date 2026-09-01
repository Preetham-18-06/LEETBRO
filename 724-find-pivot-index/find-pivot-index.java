class Solution {
    public int pivotIndex(int[] nums) {
        int ttlsum=0,pSum=0;
        for(int x:nums)
        ttlsum+=x;
        for(int i=0;i<nums.length;i++)
        {
            int right=ttlsum-pSum-nums[i];
            if(right==pSum)
            return i;
            pSum+=nums[i];
        }
        return -1;
    }
}