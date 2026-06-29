class Solution {
    public int missingNumber(int[] nums) {
        int xorSum=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            xorSum^=i;
        }
        for(int num:nums){
            xorSum^=num;
        }
        return xorSum;
    }
}