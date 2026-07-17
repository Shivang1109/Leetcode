class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int prev=-1;
            int next=-1;
            if(mid-1>=0){
                prev=nums[mid-1];
            }
            if(mid+1<n){
                next=nums[mid+1];
            }
            if(nums[mid]!=prev && nums[mid]!=next){
                return nums[mid];
            }
            else if(nums[mid]==prev && nums[mid]!=next){
                if((mid&1)==1){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            else if(nums[mid]!=prev && nums[mid]==next){
                if((mid&1)==1){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}