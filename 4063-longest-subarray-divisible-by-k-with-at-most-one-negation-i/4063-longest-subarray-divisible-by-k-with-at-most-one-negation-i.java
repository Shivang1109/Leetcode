class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            long sum = 0;
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i;j<n;j++){
                sum += nums[j];
                int rem = (int)((sum%k + k) %k);
                //store 2*x %k
                int value = (int) ((2L * nums[j] % k + k) % k);
                seen.add(value);
                //case 1
                if(rem==0 || seen.contains(rem)){
                    ans = Math.max(ans , j-i+1);
                }
            }
        }
        return ans;
    }
}