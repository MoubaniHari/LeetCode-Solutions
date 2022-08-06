class Solution {
    public int addDigits(int num) {
        int i;
        if(num<10) return num;
        do
        {
            i=sumOfDigits(num);
            num=i;
        }while(i>=10);
        return num;
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