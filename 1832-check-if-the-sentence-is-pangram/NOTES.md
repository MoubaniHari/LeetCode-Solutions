# Another Approach
public boolean checkIfPangram(String sentence) {
int i;
Map<Character,Integer> map=new HashMap<>();
for(i=0;i<sentence.length();i++)
map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
for(i=97;i<=122;i++){
if(!map.containsKey((char)i))
return false;
}
return true;
}