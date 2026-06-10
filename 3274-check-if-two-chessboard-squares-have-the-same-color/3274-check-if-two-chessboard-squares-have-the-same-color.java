class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char ch1=coordinate1.charAt(0);
        char ch2=coordinate2.charAt(0);
        char ch3=coordinate1.charAt(1);
        char ch4=coordinate2.charAt(1);
            if(((ch1-ch2)%2==0)&&((ch3-ch4)%2==0)){
                return true;

            }
            else if(((ch1-ch2)%2!=0)&&((ch3-ch4)%2!=0)){
                return true;
            }
            else{
                return false;
        }
        
    }
}