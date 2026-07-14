class Solution {
    public static boolean isValid(int[] arr, int mid, int balls){
        int n=arr.length;
        int ballCount=1;
        int lastPos=0;
        for(int i=0;i<n;i++){
            if(arr[i]-arr[lastPos]>=mid){
                ballCount++;
                lastPos=i;
            }
            if(ballCount==balls){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int s=0;
        int e=position[n-1]-position[0];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(position,mid,m)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}