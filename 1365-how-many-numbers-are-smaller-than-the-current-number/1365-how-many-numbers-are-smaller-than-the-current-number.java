class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c,k=0;
        int n= nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j]) c++;
            }
            arr[k++]=c;
        }
        return arr;
    }
}