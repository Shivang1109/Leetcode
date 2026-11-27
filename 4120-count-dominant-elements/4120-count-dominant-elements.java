class Solution {
    public int countDominantElements(int[] nums) {
        int ans = 0;
        int n = nums.length;
        if(n == 1) return 1;
        if(nums[0] >= nums[1]){
            ans++;
        }
        for(int i = 1; i < n-1; i++){
            int avg = nums[i-1] + nums[i+1];
            if(2* nums[i] >= avg){
                ans++;
            }
        }
        if(nums[n-1] >= nums[n-2]){
            ans++;
        }
        return ans;
    }
}