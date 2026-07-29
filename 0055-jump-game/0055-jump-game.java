class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int farthest=0;
        for(int i=0;i<n;i++){
            //that index cant be reached;
            if(i>farthest) return false;
            //calculate farthest index you can reach;
            farthest= Math.max(farthest, i+nums[i]);
            if(farthest>=n-1) return true;
            
        }
        return true;
        
    }
}