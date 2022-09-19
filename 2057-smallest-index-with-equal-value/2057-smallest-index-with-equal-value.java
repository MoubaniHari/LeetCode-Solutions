class Solution {
    public int smallestEqual(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i] && i<min){
                min=i;
            }
        }
        if(min==Integer.MAX_VALUE)
            min=-1;
        return min;
        
    }
}