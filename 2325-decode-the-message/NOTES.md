# Another Approach
public String decodeMessage(String key, String message) {
Map<Character,Character> map=new HashMap<>();
int i=0;
for(char c:key.toCharArray()){
if(c==' ') continue;
else if(!map.containsKey(c)){
map.put(c,(char)(i+97));
i++;
}
}
System.out.println(map);
String dec="";
for(char c:message.toCharArray())
if(c==' ') dec+=' '; else dec+=map.get(c);
return dec;
}