class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<target)
            c1++;
            else if(nums[i]==target)
            c2++;
        }
        if(c2==0)
        return list;
        list.add(c1);
        while(c2>1)
        {
            c1++;
            list.add(c1);
            c2--;
        }
        return list;
    }
}
