class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int prod1=nums[len-1]*nums[len-2]*nums[len-3];
        int prod2=nums[0]*nums[1]*nums[len-1];
        int res= Math.max(prod1,prod2);
        return res;
        
    }
}