class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int del=n/20;
        Arrays.sort(arr);
        double sum=0;
        for(int j=del;j<n-del;j++){
            sum+=arr[j];
        }
        double res= sum/(n- 2*del);
        return res;
        
    }
}