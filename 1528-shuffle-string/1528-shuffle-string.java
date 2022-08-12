class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        int i=0;
        for(int n:indices) arr[n]=s.charAt(i++);
        return new String(arr);
    }
}