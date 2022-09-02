class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        for(int i=0;i<nums.length;i++){
            int j=i,temp=nums[i];
            while(j>index[i]){
                nums[j]=nums[j-1];
                j--;
            }
            nums[index[i]]=temp;
        }
        return nums;
    }
}