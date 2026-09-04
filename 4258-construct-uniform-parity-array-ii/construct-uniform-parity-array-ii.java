class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int x:nums1)
        min=Math.min(min,x);
        if(min%2!=0)
        return true;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2!=0)
            return false;
        }
        return true;
    }
}