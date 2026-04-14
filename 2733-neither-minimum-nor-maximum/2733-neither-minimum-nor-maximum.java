import java.util.Arrays;

class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max;
        int min;
        max = Arrays.stream(nums).max().getAsInt();
        min = Arrays.stream(nums).min().getAsInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
                
            }
            
        }
        return -1;
        
    }
}