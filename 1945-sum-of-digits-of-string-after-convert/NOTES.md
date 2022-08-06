# Another Approach
public int getLucky(String s, int k) {
StringBuilder sb = new StringBuilder();
for(int i = 0; i < s.length(); i++){
char ch = s.charAt(i);
int val = ch - 'a' + 1;
sb.append(Integer.toString(val));
}
int val = 0;
while(k > 0){
val = transform(sb);
if(val < 10){
break;
}
sb = new StringBuilder(Integer.toString(val));
k--;
}
return val;
}
private int transform(StringBuilder str){
int res = 0;
for(int i = 0; i < str.length(); i++){
int val = str.charAt(i) - '0';
// System.out.print(val + " ");
res += val;
}
// System.out.println();
return res;
}