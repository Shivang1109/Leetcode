class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int a[]=new int[n+1];
        a[0]=first;
        for(int i=1;i<a.length;i++){
            a[i]=a[i-1]^encoded[i-1];
        }
        return a;
    }
}