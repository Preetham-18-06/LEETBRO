class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int diff=0,ans=0;
        for(int i=0;i<arr1.length;i++)
        {
            boolean valid = true;
            for(int j=0;j<arr2.length;j++)
            {
                int n1=arr1[i];
                int n2=arr2[j];
                diff=Math.abs(n1-n2);
                if(diff<=d)
                valid = false;
            }
            if(valid)
            ans++;
        }
        return ans;
    }
}