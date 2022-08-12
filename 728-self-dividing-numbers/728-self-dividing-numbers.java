class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(i<10) list.add(i);
            else if(f(i)) list.add(i);       
        }
        return list;
    }
    private boolean f(int n){
        int d,x=n;
        while(n!=0){
            d=n%10;
            if(d==0) return false;
            else if(x % d != 0) return false;
            n/=10;
        }
        return true;
    }
}