class Solution {
    public static boolean isValid(int[] arr,int mid ,int k){
        int subArrays=0;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>mid){
                subArrays++;
                sum=i;
            }
        }
        subArrays++;
        if(subArrays>k){
            return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
            max=Math.max(max,num);
        }
        int s=max;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid= s+ (e-s)/2;
            if(isValid(nums,mid,k)){
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