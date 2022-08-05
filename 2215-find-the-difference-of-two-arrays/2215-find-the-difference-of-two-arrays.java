class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        List<Integer> l1=new ArrayList<>();
        int flag=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                    flag=1;
            }
            if(flag==0 && !l1.contains(nums1[i]))
                l1.add(nums1[i]);
            flag=0;
        }
        l.add(l1);
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                    flag=1;
            }
            if(flag==0 && !l2.contains(nums2[i]))
                l2.add(nums2[i]);
            flag=0;
        }
        l.add(l2);
        return l;
    }
}