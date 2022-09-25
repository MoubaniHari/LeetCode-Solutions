class Solution {
    public char repeatedCharacter(String s) {
        int letters[]=new int[26];
        for(char c:s.toCharArray())
        {
            letters[(int)c - 97]++;
            if(letters[(int)c - 97]==2)
                return c;
        }
        return '0';
    }
}