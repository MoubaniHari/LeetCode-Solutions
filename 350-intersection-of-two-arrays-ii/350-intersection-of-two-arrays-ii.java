class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1)   // Fill the map with nums1 elements
            map.put(i,map.getOrDefault(i,0)+1);
        for(int i:nums2)
            if(map.containsKey(i))
            {
                list.add(i);
                int time=map.get(i)-1;
                if(time==0)
                    map.remove(i);
                else
                    map.put(i,time);
            }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=list.get(i);
        return arr;
    }
}