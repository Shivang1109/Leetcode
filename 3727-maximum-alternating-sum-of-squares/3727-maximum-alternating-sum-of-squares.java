class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        long firstHalf = 0;
        for(int i=0; i<n/2;i++){
            firstHalf += 1L * nums[i]*nums[i];
        }
        long secondHalf = 0;
        for(int i=n/2; i<n; i++){
            secondHalf += 1L * nums[i]*nums[i];

        }
        return secondHalf - firstHalf;
    }
}