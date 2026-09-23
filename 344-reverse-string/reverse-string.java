class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0,right=n-1;
        while(i<right)
        {
            char temp=s[i];
            s[i]=s[right];
            s[right]=temp;
            i++;
            right--;
        }
    }
}