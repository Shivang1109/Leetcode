class Solution {
    public int getMaximumGenerated(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                arr[i]=0;
            }
            else if(i==1){
                arr[i]=1;
            }
            else if(i%2==0){
                arr[i]=arr[i/2];
            }
            else{
                arr[i]=arr[(i+1)/2]+arr[i/2];
            }

        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        
    }
}