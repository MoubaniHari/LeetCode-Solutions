class Solution {
    public boolean isHappy(int n) {
        int d,sum;
        Set<Integer> set=new HashSet<>();
        while(set.add(n))
        {
            sum=0;
            while(n!=0){
                d=n%10;
                n=n/10;
                sum+=Math.pow(d,2);
            }
            if(sum==1)
                return true;
            else
                n=sum;
        }
        return false;
    }
}