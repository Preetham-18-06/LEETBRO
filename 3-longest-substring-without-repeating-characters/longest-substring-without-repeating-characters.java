class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int n=s.length();
        int maxL=0;
        HashSet<Character> set=new HashSet<>();
        for(int r=0;r<n;r++)
        {
            set.add(s.charAt(r));

            while(r-l+1!=set.size())
            {
                set.remove(s.charAt(l));
                l++;
                set.add(s.charAt(r));
            }
            maxL=Math.max(maxL,r-l+1);
        }
        return maxL;
    }
}