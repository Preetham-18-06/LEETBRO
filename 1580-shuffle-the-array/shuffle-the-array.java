class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int n1=nums.length;
        int count=0; 
        int ans[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            if(i%2==0 && count<n)
            {
                ans[i]=nums[count];
                count++;
            }
            else
            {
                ans[i]=nums[n];
                n++;
            }
        }
        return ans;
    }
}