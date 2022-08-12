# Brute Force Approach
public int[] getConcatenation(int[] nums) {
List<Integer> list = new ArrayList<>();
int i=1;
while(i++<3)
list.addAll(f(nums));
int ans[]=new int[2*nums.length];
i=0;
for(int n:list)
ans[i++]=n;
return ans;
}
private List<Integer> f(int[] arr){
List<Integer> l = new ArrayList<>();
for(int n:arr)
l.add(n);
return l;
}