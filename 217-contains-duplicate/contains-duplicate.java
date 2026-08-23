import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        boolean ans=false;
        for(int x:nums)
            set.add(x);
        if(set.size()<nums.length)
        ans=true;
        return ans;
    }
}