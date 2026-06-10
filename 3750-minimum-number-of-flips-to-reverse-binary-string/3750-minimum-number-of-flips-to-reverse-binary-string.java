class Solution {
    public int minimumFlips(int n) {
        int flip=0;
        String s=Integer.toBinaryString(n);
        String s1=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(s1.charAt(i))){
                flip++;
            }
        }
        return flip;
    }
}