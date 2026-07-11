class Solution {
    public static boolean isValid(int[] arr,int mid, int threshold){
        int sum=0;
        for(int i:arr){
            int divisor=(int)Math.ceil((double)i/mid);
            sum+=divisor;
            if(sum>threshold){
                return false;
            }
        }
        return true;
    }
    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    } 
    public int smallestDivisor(int[] nums, int threshold) {
        int max=findMax(nums);
        int s=1;
        int e=max;
        int ans=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if (isValid(nums,mid,threshold)){
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