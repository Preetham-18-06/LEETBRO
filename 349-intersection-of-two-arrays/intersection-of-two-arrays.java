class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++)
            set1.add(nums1[i]);
        for(int i=0;i<n2;i++)
            set2.add(nums2[i]);
        for(int x: set2)
        {
            if(set1.contains(x))
            set.add(x);
        }
        int result[]=new int[set.size()];
        int i=0;
        for(int x:set)
        {
            result[i]=x;
            i++;
        }
        return result;
    }
}