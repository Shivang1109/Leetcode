class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int i=1;
        int len=nums.length-1;
        int sum=0;
        while(i<=k){
            sum+=nums[len];
            nums[len]=nums[len]+1;
            i++;   
        }
        return sum;    
    }
}