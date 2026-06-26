class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        boolean isOne=false;
        boolean isTwo=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) isOne=true;
            if(nums[i]==2) isTwo=true;
        }
        if(!(isOne&&isTwo)){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==2){
                        int diff=Math.abs(i-j);
                        if(diff<min) min=diff;
                    }
                }
            }
        }
        return min;
    }
}