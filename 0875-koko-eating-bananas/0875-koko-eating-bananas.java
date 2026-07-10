class Solution {
    public static boolean isValid(int[] arr,int mid,int h){
        int totalHours=0;
        for(int i=0;i<arr.length;i++){
            int hours=(int) Math.ceil((double)arr[i]/mid);
            totalHours+=hours;
            if(totalHours>h){
                return false;
            }
        }    
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int s=1;
        int e=max;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(isValid(piles,mid,h)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;  
    }
}