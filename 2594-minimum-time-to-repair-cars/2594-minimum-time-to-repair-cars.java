class Solution {
    public static boolean isValid(int[] arr, long mid, int cars){
        long sum=0;
        for(int i:arr){
            long temp=mid/i;
            long ans=(long)Math.sqrt(temp);
            sum+=ans;
            if(sum>=cars){
                return true;
            }
        }
        return false;
    }


    public long repairCars(int[] ranks, int cars) {
        int max=Integer.MIN_VALUE;
        for(int i:ranks){
            max=Math.max(max,i);
        }
        long s=0;
        long e=(long)max*cars*cars;
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValid(ranks,mid,cars)){
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