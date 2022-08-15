class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char ch='a';
        map.put(' ',' ');
        for(char c:key.toCharArray())
            if(!map.containsKey(c)) 
                map.put(c,ch++);
        String dec="";
        for(char c:message.toCharArray())
            dec+=map.get(c);
        return dec;
    }
}