class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = 1_000_000_007;
        int[] bitCount = new int[32];

        for(int num:nums){
            for(int i=0;i<32;i++){
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        long ans = 0;
        for(int j =0; j<k; j++){
            long x = 0;
            for(int i=0; i<32; i++){
                if(bitCount[i] > 0){
                    x |= (1L << i);
                    bitCount[i]--;
                }
            }
            ans = (ans + (x * x) % mod) % mod;
        }
        return (int)ans;
    }
}