class Solution {
    public int thirdMax(int[] nums) {
        long lar1=Long.MIN_VALUE;
        long lar2=Long.MIN_VALUE;
        long lar3=Long.MIN_VALUE;
        for(int i:nums){
            if(i==lar1 || i==lar2 || i==lar3){
                continue;
            }
            if(i>lar1){
                lar3=lar2;
                lar2=lar1;
                lar1=i;
            }
            else if(i>lar2){
                lar3=lar2;
                lar2=i;
            }
            else if(i>lar3){
                lar3=i;
            }
        }
        if(lar3==Long.MIN_VALUE){
            lar3=lar1;
        }
        return (int)lar3;
}
}
