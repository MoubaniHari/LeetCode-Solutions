class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] ans = new int[2*nums.length];
        // System.arraycopy(nums,0,ans,0,nums.length);
        // System.arraycopy(nums,0,ans,nums.length,nums.length);
        // return ans;
        int[] ans = new int[2*nums.length];
        int i=0;
        for(int n:nums)
            ans[i++]=n;
        for(int n:nums)
            ans[i++]=n;
        return ans;
    }
}