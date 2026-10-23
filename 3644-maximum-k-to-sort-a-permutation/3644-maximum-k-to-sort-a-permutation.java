class Solution {
    public int sortPermutation(int[] nums) {
        int k = 0;
        int n = nums.length;
        boolean first = true;
        for(int i = 0; i < n; i++){
            if(nums[i]!=i){
                if(first){
                    k = nums[i];
                    first = false;
                }
                else{
                    k &= nums[i];
                }
            }
        }
        return k;
    }
}