class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int x=nums[i];
            sum=0;
            while(x>0)
            {
                int a=x%10;
                sum+=a;
                x/=10;
            }
            if(sum==i)
                return i;
        }
        return -1;
    }
}