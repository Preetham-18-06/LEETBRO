class Solution {
    public long countValidSubstrings(String s) {
        long count=0;
        int l=0,n=s.length();
        for(int r=0;r<n;r++)
        {
            if(r>=2 && s.substring(r-2,r+1).equals("abc"))
            l=Math.max(l,r-1);
            count+=(r-l+1);
        }
        return count;
    }
}
