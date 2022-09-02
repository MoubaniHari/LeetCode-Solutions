class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int flag=0,consistent=0;
        for(String s: words){
            for(char c: s.toCharArray()){
                if(!allowed.contains(c+"")){
                    flag=0;
                    break;
                }
                else 
                    flag=1;
            }
            if(flag==1)
                consistent++;
        }
        return consistent;
    }
}