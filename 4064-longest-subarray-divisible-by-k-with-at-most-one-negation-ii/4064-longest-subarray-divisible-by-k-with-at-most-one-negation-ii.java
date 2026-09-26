class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int INF = n+1;

        int[] first = new int[k];
        Arrays.fill(first,INF);

        first[0]=0;

        int[] order = new int[k];
        int count = 1;
        order[0] = 0;

        int prefix = 0;

        for(int r=1;r<=n;r++){
            prefix = (int)(((long) prefix + nums[r-1]) % k);
            if(prefix < 0) prefix += k;

            if(first[prefix] == INF){
                first[prefix] = r;
                order[count++] = prefix;
            }
        }
        int[] ptr = new int[k];
        int[] best = new int[k];

        Arrays.fill(best,INF);

        int ans = 0;
        prefix = 0;

        for(int r =1; r<=n;r++){
            int x = nums[r-1];
            int q = (int)((2L * x) % k);

            if(q < 0) q+=k;

            while(ptr[q] < count && first[order[ptr[q]]]<r){
                int p = order[ptr[q]];
                ptr[q]++;
                int newPrefix = (p+q)%k;
                best[newPrefix] = Math.min(best[newPrefix],first[p]);
            }
            prefix = (int)(((long) prefix + x) % k);
            if(prefix < 0){
                prefix += k;
            }
            if(first[prefix] !=INF){
                ans = Math.max(ans, r-first[prefix]);
            }
            if(best[prefix] != INF){
                ans = Math.max(ans, r-best[prefix]); 
            }
        }
        return ans;
        
        
        
        
    }
}