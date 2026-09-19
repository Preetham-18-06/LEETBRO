class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int left=0,len=0;
        int sum=0,ans=Integer.MAX_VALUE;
        int best[]=new int[arr.length];
        Arrays.fill(best,Integer.MAX_VALUE);
        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];

            while(sum>target)
            {
                sum-=arr[left];
                left++;
            }

            if(right>0)
            best[right]=best[right-1];

            if(sum==target)
            {
                len=right-left+1;

                if(left>0 && best[left-1]!=Integer.MAX_VALUE)
                ans=Math.min(ans,len+best[left-1]);
                best[right] = Math.min(best[right], len);
            }   
            
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}