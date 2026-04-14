class Solution {
    public int maxSubArray(int[] nums) {
        int current=nums[0];
        int max=nums[0];
        int len=nums.length;
        for(int i=1;i<len;i++){
            current=Math.max(nums[i],current+nums[i]);
            max=Math.max(current,max);

        }
        return max;
        
    }
}