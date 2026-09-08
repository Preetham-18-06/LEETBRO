class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,n=nums.length;        
        int ans[]=new int[n];
        ans[0]=p;
        for(int i=1;i<n;i++)
        {
            p*=nums[i-1];
            ans[i]=p;
        }
        int r=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=r;
            r*=nums[i];
        }
        return ans;
    }
}
