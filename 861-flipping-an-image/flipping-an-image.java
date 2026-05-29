class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        int target[][]=new int[m][n];
        
        for(int i=0;i<image.length;i++)
        {
            int k=0;
            for(int j=n-1;j>=0;j--)
            {
                target[i][j]=1-image[i][k];
                // target[i][j]=image[i][k];
                k++;
                // if(target[i][j]==0)
                // target[i][j]=1;
                // else 
                // target[i][j]=0;            
            }
        }
        return target;
    }
}