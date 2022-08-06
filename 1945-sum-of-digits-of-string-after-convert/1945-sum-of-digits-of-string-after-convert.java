class Solution {
    public int getLucky(String s, int k) {
        int val=0,sum=0;
        String str="";
        for(char c : s.toCharArray())
            str+=(int)c-96;
        while(k-->0)
        {
            sum=0;
            for(int i=0;i<str.length();i++)
                sum+=str.charAt(i)-'0';
            val=sum;
            str=Integer.toString(sum);
        }
        return val;
    }
}