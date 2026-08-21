class Solution {
    public int majorityElement(int[] nums) {
        // //Boyer Moore Algorithm 
        // int candidate=0;
        // int count=0;
        // for(int x:nums)
        // {
        //     if(count==0)
        //         candidate=x;
        //     if(x==candidate)
        //     count++;
        //     else 
        //     count--;
        // }
        // return candidate;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int ans=0;
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>n/2)
            ans=entry.getKey();
        }
        return ans;
    }
}