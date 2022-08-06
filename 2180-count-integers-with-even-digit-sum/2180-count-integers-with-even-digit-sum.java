class Solution {
    public int countEven(int num) {
        int i=2,sum,c=0;
        while(i<=num)
        {
            sum=sumOfDigits(i);
            if(sum%2 == 0)
                c++;
            i++;
        }
        return c;
    }
    public int sumOfDigits(int n)
    {
        int d,sum=0;
        while(n>0)
        {
            d=n%10;
            n/=10;
            sum+=d;
        }
        return sum;
    }
}