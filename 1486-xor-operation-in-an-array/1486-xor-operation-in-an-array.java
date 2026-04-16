class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        arr[0]=start;
        for(int i=1;i<arr.length;i++){
            arr[i]=start+2*i;
        }
        int res=0;
        for(int j=0;j<arr.length;j++){
            res^=arr[j];
        }
        return res;
        
    }
}