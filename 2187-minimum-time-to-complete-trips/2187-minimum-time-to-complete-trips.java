class Solution {
    public static boolean isValid(int[] arr, long mid, int noOfTrips){
        long total=0;
        for(int i:arr){
            total+=mid/i;
            if(total>=noOfTrips){
                return true;
            }
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int min=Integer.MAX_VALUE;
        for(int i:time){
            min=Math.min(min,i);
        }
        long s=0;
        long e=(long)min*totalTrips;
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValid(time,mid,totalTrips)){
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