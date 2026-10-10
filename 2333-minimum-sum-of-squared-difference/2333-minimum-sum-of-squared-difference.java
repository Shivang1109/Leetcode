class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] arr = new int[n];
        int maxDiff = 0;
        for(int i=0;i<n;i++){
            arr[i] = Math.abs(nums1[i]-nums2[i]);
            maxDiff = Math.max(maxDiff, arr[i]);
        }
        long k = (long) k1+k2;
        long total = 0;
        for(int i:arr){
            total += i;
        }
        if(k >= total) return 0;
        int[] freq = new int[maxDiff+1];
        for(int i:arr){
            freq[i]++;
        }
        for(int d=maxDiff; d>0 && k>0; d--){
            int count = freq[d];
            int reduce = (int) Math.min(k,count);

            freq[d] -= reduce;
            freq[d-1] += reduce;
            k -= reduce;

        }
        long ans = 0;
        for (int d = 0; d < freq.length; d++) {
            ans += (long) d * d * freq[d];
        }
        return ans;
    }
}