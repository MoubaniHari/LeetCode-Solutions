class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
            if(Character.isDigit(s.charAt(i))) {
                int val=Character.getNumericValue(s.charAt(i));
                sb.append((char)((int)s.charAt(i-1)+val));
            }
            else sb.append(s.charAt(i));
        return sb.toString();
    }
}