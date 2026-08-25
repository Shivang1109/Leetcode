class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] digRange = new int[n];
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while(num!=0){
                int rem = num%10;
                max = Math.max(rem,max);
                min = Math.min(rem,min);
                num /= 10;
                
            }
            int digRangeAns = max - min;
            max2 = Math.max(digRangeAns,max2);
            digRange[i] = digRangeAns;
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(digRange[i]==max2){
                res += nums[i];
            }
        }
        return res;
        
    }
}