class Solution {
    public boolean halvesAreAlike(String s) {
        int half1=0;
        int half2=0;
        int k=s.length()/2;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                half1++;
            }
        }
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                half2++;
            }
        }
        return half1==half2;
    }
}