# Another Approach
public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
String str1=f(word1);
String str2=f(word2);
if(str1.equals(str2)) return true;
return false;
}
private String f(String[] word){
String str="";
for(String s:word)
{
char ch[]=s.toCharArray();
for(char c:ch)
str+=c;
}
return str;
}