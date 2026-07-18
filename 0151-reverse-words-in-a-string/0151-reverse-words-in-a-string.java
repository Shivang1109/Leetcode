class Solution {
    public String reverseWords(String s) {
        StringBuilder sb =  new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            //remove trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            // j ko word ke phle index pe le jao
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            //ans me add kr do 
            sb.append(s.substring(j+1,i+1));
            //beech ke trailing spaces ko hatao
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            //agar last word nahi hai to space add krdo;
            if(j>=0){
                sb.append(' ');
            }
            //ab waps se i ko j ke jagah pe le jao ;
            i=j;
        }
        return sb.toString();
        
    }
}