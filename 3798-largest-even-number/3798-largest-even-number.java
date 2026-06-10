class Solution {
    public int reqIndex(String s){
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='2'){
                return i;
            }
        }
        return -1;
    }
    public String largestEven(String s) {
        int index=reqIndex(s);
        return s.substring(0,index+1);
        
    }
}