class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0) {
            columnNumber--;
            int rem=columnNumber%26;
            sb.append((char)(rem+65));
            columnNumber=columnNumber/26;
        }
        sb.reverse();
        String s=sb.toString();
        return s;
    }
}