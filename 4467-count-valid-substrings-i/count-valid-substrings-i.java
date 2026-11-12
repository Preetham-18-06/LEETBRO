class Solution {
    public long countValidSubstrings(String s) {
        int left=0,n=s.length();
        long count=0;
        for(int right=0;right<n;right++)
        {
            if(right>=2 && s.substring(right-2,right+1).equals("abc"))
            left=Math.max(left,right-1);
            count+=right-left+1;
        }
        return count;
    }
}