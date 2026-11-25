class Solution {
    public int minRange(int a, int b, int c) {
        int max = Math.max(a , Math.max(b,c));
        int min = Math.min(a , Math.min(b,c));
        if(max == a){
            max = Math.min(a , b+c);
        }
        else if(max == b){
            max = Math.min(b , a+c);
        }
        else{
            max = Math.min(c , a+b);
        }
        return max - min;
    }
}