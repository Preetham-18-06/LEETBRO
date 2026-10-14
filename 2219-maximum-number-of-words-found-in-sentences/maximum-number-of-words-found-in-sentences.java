class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences)
        {
            String[] x=s.split(" ");
            if(x.length>max)
            max=x.length;
        }
        return max;
    }
}