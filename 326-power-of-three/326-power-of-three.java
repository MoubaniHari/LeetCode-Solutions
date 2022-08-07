class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n==0) return false;
        // while(n!=1){
        //     if(n%3!=0) return false;
        //     else n/=3;
        // }
        // return true;
        if(n==0) return false;
        if(n==1) return true;
        if(n%3!=0) return false;
        else return isPowerOfThree(n/3);
    }
}