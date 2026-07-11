class Solution {
    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public static int totalSum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static boolean isValid(int[] arr,int mid ,int days){
        int sum=0;
        int totalDays=0;
        for(int i:arr){
            sum+=i;
            if(sum>mid){
                totalDays++;
                sum=i;
            }
        }
        totalDays++;
        if(totalDays<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s=findMax(weights);
        int e=totalSum(weights);
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(weights,mid,days)){
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