class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int val : nums) {
            String s = String.valueOf(val);
            int sum=0;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                sum+=c-'0';

            }
            min=Math.min(sum,min);
        }
        return min;
        
    }
}