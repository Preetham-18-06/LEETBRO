class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalin(s,i,j)==true)
                {
                    if(j-i+1>res.length())
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }

    public boolean isPalin(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}