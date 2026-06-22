class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='#'){
                String s1=s.substring(i-2,i);
                int temp=Integer.parseInt(s1);
                sb.append((char)(temp+'a'-1));
                i=i-2;
            }
            else{
                sb.append((char)(ch-'0'+'a'-1));
            }
        }
        sb.reverse();
        return sb.toString();
    }
}