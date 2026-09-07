class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p=1,right=1;
        int[] ans=new int[n];
        ans[0]=p;
        for(int i=1;i<n;i++)
        {
            p*=nums[i-1];
            ans[i]=p;
        }

        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}