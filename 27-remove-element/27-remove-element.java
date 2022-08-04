class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0,right=0,n=nums.length,c=0;
        while(right<n)
        {
            if(nums[right]!=val){ 
                swap(left++,right,nums);
                c++;
            }
            right++;
        }
        return c;
    }
    private void swap(int l,int r,int[] arr)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}