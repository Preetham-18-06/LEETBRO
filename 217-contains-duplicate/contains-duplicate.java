import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums)
            set.add(x);
        if(n>set.size())
        ans=true;
        return ans;
    }
}