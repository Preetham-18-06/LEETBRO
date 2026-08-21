class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int comp=0;
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            comp=target-nums[i];
            if(map.containsKey(comp))
            {
                ans[0]=map.get(comp);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}