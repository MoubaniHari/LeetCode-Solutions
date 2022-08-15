class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        String str="";
        while(address.length()!=0)
        {
            if(address.indexOf('.')==-1) break;
            str=address.substring(0,address.indexOf('.'));
            sb.append(str);
            sb.append("[.]");
            address=address.substring(address.indexOf('.')+1);
        }
        sb.append(address);
        return sb.toString();
    }
}