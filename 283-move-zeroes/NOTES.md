# Brute Force Approach
​
```
public void moveZeroes(int[] nums) {
int n=nums.length;
List<Integer> l=new ArrayList<>();
int c=0;
for(int x:nums)
{
if(x==0) c++;
else l.add(x);
}
while(c--!=0) l.add(0);
for(int i=0;i<n;i++) nums[i]=l.get(i);
}
```