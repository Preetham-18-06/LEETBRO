class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long currentSum=0;
        long max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            currentSum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        
        if(map.size()==k)
        max=currentSum;

        for(int i=1;i<=n-k;i++)
        {
            int outgoing=nums[i-1];
            int count=map.get(outgoing);
            if(count==1)
            map.remove(outgoing);
            else 
            map.put(outgoing,count-1);

            int incoming=nums[k+i-1];
            map.put(incoming,map.getOrDefault(incoming,0)+1);
            currentSum=currentSum+incoming-outgoing;
            if(map.size()==k)
            max=Math.max(currentSum,max);
        }
        return max;
    }
}