# Another Approach
String s1="";
for(int i=0;i<s.length();i++){
if(Character.isUpperCase(s.charAt(i))) s1+=Character.toLowerCase(s.charAt(i));
else s1+=s.charAt(i);
}
return s1;