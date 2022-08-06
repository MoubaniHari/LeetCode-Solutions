class Solution {
    public long[] sumOfThree(long num) {
        long res,res1,res2;
        if(num%3 != 0)
            return new long[]{};
        else
        {
            res=num/3;
            res1=res-1;
            res2=res+1;
            long[] arr = new long[]{res1,res,res2};
            return arr;
        }
    }
}