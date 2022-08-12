class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        int i=0;
        String str="";
        for(char c:s.toCharArray()) arr[indices[i++]]=c;
        for(char c:arr) str+=c;
        return str;
    }
}