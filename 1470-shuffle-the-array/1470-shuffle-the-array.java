class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k=0,i=0,j=n;
        while(i<n && j<nums.length){
            arr[k++]=nums[i++];
            arr[k++]=nums[j++];
        }
        return arr;
    }
}