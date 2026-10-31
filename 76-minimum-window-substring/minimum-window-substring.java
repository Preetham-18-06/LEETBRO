class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();

        if(m<n)
        return "";
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        int minL=Integer.MAX_VALUE;
        int start=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        int matched=0;
        int l=0;
        for(int r=0;r<m;r++){
            char rightChar=s.charAt(r);
            map2.put(rightChar,map2.getOrDefault(rightChar,0)+1);
            if(map1.containsKey(rightChar) && 
            map2.get(rightChar) <= map1.get(rightChar))
            matched++;

            
            while(matched==n){
                if(r-l+1<minL){
                    minL=r-l+1;
                    start=l;
                }
                char leftChar=s.charAt(l);

                if(map1.containsKey(leftChar) &&
                map2.get(leftChar)<=map1.get(leftChar)){
                    matched--;
                }

                map2.put(leftChar,map2.get(leftChar)-1);
                l++;
            }
        }
        return minL==Integer.MAX_VALUE?
        "" : s.substring(start,start+minL);
    }
}
