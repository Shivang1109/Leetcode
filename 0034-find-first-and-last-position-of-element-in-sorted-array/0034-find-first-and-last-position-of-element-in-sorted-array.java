class Solution {
    public int firstIndex(int[] arr,int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int pos=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==target){
                pos=mid;
                e=mid-1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return pos;
    }

    public int lastIndex(int[] arr,int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int pos=-1;
        while(s<=e){
            int mid= s +(e-s)/2;
            if(arr[mid]==target){
                pos=mid;
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return pos;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=firstIndex(nums,target);
        res[1]=lastIndex(nums,target);
        return res;
    }
}