class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0||s=="")
            return true;
        s=s.toLowerCase();
        char readAllWords[] = s.toCharArray();
        String original="";
        for(int k=0;k<readAllWords.length;k++)
        {
            if(Character.isAlphabetic(readAllWords[k]) || Character.isDigit(readAllWords[k]))
                original+=readAllWords[k];
        }
        
        for(int i=0;i<original.length()/2;i++){
            int j=original.length()-i-1;
            if(original.charAt(i)==original.charAt(j))
                continue;
            else
                return false;
        }
        return true;
    }
}