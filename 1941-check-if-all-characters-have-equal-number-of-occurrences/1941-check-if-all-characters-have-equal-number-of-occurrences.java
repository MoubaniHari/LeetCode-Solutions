class Solution {
    public boolean areOccurrencesEqual(String s) {
        int letters[]=new int[26];
        
        for(char c:s.toCharArray())
        {
             letters[(int)c-97]++;   
        }
        
        int refrence=(int)(s.charAt(0))-97;
        for(int i=0;i<letters.length;i++)
        {
                if(letters[i]==0)
                        continue;
                else if(letters[i]!=letters[refrence])
                        return false;
        }
        return true;
    }
}