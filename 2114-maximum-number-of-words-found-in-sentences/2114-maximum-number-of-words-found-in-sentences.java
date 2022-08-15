class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord=0,wordCount;
        for(int i=0;i<sentences.length;i++)
        {
            wordCount=0;
            for(int j=0;j<sentences[i].length();j++)
                if(sentences[i].charAt(j)==' ') wordCount++;
            wordCount++;
            if(wordCount>maxWord) maxWord=wordCount;
        }
        return maxWord;
    }
}