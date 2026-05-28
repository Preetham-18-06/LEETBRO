class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        int num=0,ans=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            num=nums[i];
            while(num>0)
            {
                num/=10;
                count++;
                if((num==0) && (count%2==0))
                ans++;
            }
        }
        return ans;
    }
}