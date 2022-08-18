class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=max(candies);
        for(int i=0;i<candies.length;i++)
            if(candies[i]+extraCandies>=max) list.add(true);
            else list.add(false);
        return list;
    }
    private int max(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++)
            if(a[i]>max) max=a[i];
        return max;
    }
}