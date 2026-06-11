class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s: details) {
            char ch1=s.charAt(11);
            char ch2=s.charAt(12);
            if(ch1>'6' && ch2>='0'){
                count++;
            }
            else if(ch1=='6' && ch2>'0'){
                count++;
            }
            else{
                //nothing;
            }
        }
        return count;
    }
}