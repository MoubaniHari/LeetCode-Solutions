class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<command.length();){
            if(command.charAt(i)=='G'){
                sb.append(command.charAt(i));
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append('o');
                i=i+2;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
                i=i+4;
            }
        }
        return sb.toString();
    }
}