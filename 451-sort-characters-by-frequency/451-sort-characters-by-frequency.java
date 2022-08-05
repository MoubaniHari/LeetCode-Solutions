class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        String s1="";
        int size=map.size();
        while(size-->0)
        {
            int valueMax=0;
            char keyMax=0;
            for(Map.Entry<Character,Integer> entry:map.entrySet())
            {
                if(entry.getValue()>valueMax){
                    valueMax=entry.getValue();
                    keyMax=entry.getKey();
                }
            }
            while(valueMax-->0)
                s1=s1+keyMax;
            map.remove(keyMax);
        }
        return s1;
    }
}