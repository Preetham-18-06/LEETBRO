class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int area=0,maxarea=0;
        while(left<right)
        {
            area=min(height[left],height[right])*(right-left);
            if(area>maxarea)
            maxarea=area;
            if(height[left]<height[right])
            left++;
            else 
            right--;
           
        }
        return maxarea;
    }
    int min(int a,int b)
    {
        if(a>b)
        return b;
        else 
        return a;
    }
}