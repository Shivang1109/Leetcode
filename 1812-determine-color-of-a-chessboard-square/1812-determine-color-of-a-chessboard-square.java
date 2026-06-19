class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch1=coordinates.charAt(0);
        char ch2=coordinates.charAt(1);
        if((ch1+ch2)%2==0) return false;
        return true;
    }
}