class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int diff=xor&(-xor);
        int b1=0;
        int b2=0;
        for(int num:nums){
            if((num & diff)==0){
                b1^=num;
            }
            else{
                b2^=num;
            }
        }
        ans[0]=b1;
        ans[1]=b2;
        return ans;
        
    }
}