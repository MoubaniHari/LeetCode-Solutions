class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s : sentences) {
            int space = 0;
            char[] carr = s.toCharArray();
            for(char c : carr)
                if(c == ' ') space++;
        
            if(max < space) max = space;
        }
        return max+1;
    }
}