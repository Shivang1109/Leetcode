class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp = nums[i];
            while(temp>0){
                int rem=temp%10;
                temp/=10;
                sum+=rem;
            }
            nums[i]=sum;
            min=Math.min(min,nums[i]);
        }
        return min;
        
    }
}