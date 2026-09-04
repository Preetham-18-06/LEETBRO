class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int right[]=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        right[i]=Math.min(right[i+1],nums[i]);

        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            if(max-right[i]<=k)
            return i;
        }
        return -1;
    }
}