class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int x:nums) map.put(x,map.getOrDefault(x,0)+1);
        
        int s=0;
        for(int v: map.values()) s+=f(v);
        
        return s;
              
    }
    
    private int f(int n){
        return n*(n-1)/2;
    }
}