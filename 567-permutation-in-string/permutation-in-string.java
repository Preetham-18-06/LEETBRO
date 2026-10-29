class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] sFreq=new int[26];
        int[] windowFreq=new int[26];

        if(s1.length()>s2.length())
        return false;

        for(int i=0;i<s1.length();i++)
        sFreq[s1.charAt(i)-'a']++;

        int l=0;
        for(int r=0;r<s2.length();r++)
        {
            windowFreq[s2.charAt(r)-'a']++;
            while(r-l+1>s1.length())
            {
                windowFreq[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(sFreq,windowFreq) && r-l+1==s1.length())
                return true;
        }
        return false;
    }
}