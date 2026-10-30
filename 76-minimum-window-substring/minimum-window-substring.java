class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++)
        map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);

        if(m<n)
        return "";

        HashMap<Character,Integer> map2=new HashMap<>();
        int l=0;
        int matched=0;
        int minL=Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(map1.containsKey(ch) && map2.get(ch)<=map1.get(ch))
            matched++;
            while (matched == n) {

                if (r - l + 1 < minL) {
                    minL = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);

                if (map1.containsKey(leftChar) &&
                    map2.get(leftChar) <= map1.get(leftChar)) {
                    matched--;
                }

                map2.put(leftChar, map2.get(leftChar) - 1);
                l++;
            }
            
        }
        return minL == Integer.MAX_VALUE
       ? ""
       : s.substring(start, start + minL);
    }
}