class Solution {
    public String decodeMessage(String key, String message) {
        // Map<Character,Character> map=new HashMap<>();
        // char ch='a';
        // map.put(' ',' ');
        // for(char c:key.toCharArray())
        //     if(!map.containsKey(c)) 
        //         map.put(c,ch++);
        // StringBuilder sb = new StringBuilder();
        // for(char c:message.toCharArray())
        //     sb.append(map.get(c));
        // return sb.toString();
        HashMap < Character, Character > map = new HashMap < > ();
        char flet = 'a';
        for (char c: key.toCharArray()) {
            if (!map.containsKey(c) && c != ' ') {
                map.put(c, flet++);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c: message.toCharArray()) {
            if (c == ' ') result.append(" ");
            else result.append(map.get(c));
        }
        return result.toString();
    }
}