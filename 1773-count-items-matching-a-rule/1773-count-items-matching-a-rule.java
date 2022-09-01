class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int attri=0;
        
        if(ruleKey.equals("color")){
            attri=1;
        }
        else if(ruleKey.equals("name")){
            attri=2;
        }
        
        int match=0;
        
        for(List<String> i: items){
            if((i.get(attri).equals(ruleValue))){
                match++;
            }
        }
        return match;
    }
}