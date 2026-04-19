class Solution {

    int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        if ((n & 1) == 1) count++;
        n >>= 1;
    }
    return count;
}


    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=countSetBits(i);

        }
        return arr;
        
    }
}