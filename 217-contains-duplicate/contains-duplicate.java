import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        boolean ans=true;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        if(set.size()==n)
        {
            ans=false;
        }
        return ans;
    }
}