class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String n:operations)
            if(n.charAt(1)=='+') X++; else X--;
        return X;
    }
}