Recursive Approach
if(n==0) return false;
if(n==1) return true;
if(n%3!=0) return false;
else isPowerOfThree(n/3);