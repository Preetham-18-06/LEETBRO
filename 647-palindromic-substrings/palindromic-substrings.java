class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            count+=len1+len2;
        }
        return count;
    }

    private int expand(String s, int l,int r)
    {
        int len=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
        len++;
        l--;
        r++;
        }
        return len;
    }
}