class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char ch1= (char) (coordinate1.charAt(0)-'a'+1);
        char ch2= (char) (coordinate2.charAt(0)-'0');
        char ch3= (char) (coordinate1.charAt(1)-'a'+1);
        char ch4= (char) (coordinate2.charAt(1)-'0');
        int colour1=(ch1+ch3)%2;
        int colour2=(ch2+ch4)%2;
        return colour1==colour2;
    }
}