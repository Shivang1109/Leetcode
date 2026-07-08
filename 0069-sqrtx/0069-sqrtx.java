class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int s=0;
        int e=x;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            //mid * mid==x is not used as integer overflow can happen
            //mid*mid==x
            if(mid==x/mid) return mid;
            //mid*mid>x
            else if(mid>x/mid) e=mid-1;
            //mid*mid<x
            //store the mid and move right to check if any other solution exists.
            else{
                res=mid;
                s=mid+1;
            }
        }
        return res;   
    }
}