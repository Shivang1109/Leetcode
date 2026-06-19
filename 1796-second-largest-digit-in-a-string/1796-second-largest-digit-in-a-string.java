class Solution {
    public int secondHighest(String s) {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {

                if (c > max) {
                    max2 = max;
                    max = c;
                } else if (c > max2 && c!=max) {
                    max2 = c;
                }
            }
        }
        if(max2>='0' && max2<='9') {
            return max2-'0';
        }
        else{
            return -1;
        }
    }
}