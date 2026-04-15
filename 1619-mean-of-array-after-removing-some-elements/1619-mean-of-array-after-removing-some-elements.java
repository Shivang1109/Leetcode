class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int del=n/20;
        Arrays.sort(arr);
        int p1=0;
        int p2=n-1;
        for(int i=1;i<=del;i++){
            p1++;
            p2--;
            
        }
        double sum=0;
        for(int j=p1;j<=p2;j++){
            sum+=arr[j];
        }
        double res= sum/(n- 2*del);
        return res;
        
    }
}