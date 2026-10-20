class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            int prevMax = Integer.MIN_VALUE;
            boolean valid = true;

            for (int i = 0; i < n; i += k) {
                int[] block = new int[k];

                for (int j = 0; j < k; j++) {
                    block[j] = nums[i + j];
                }

                int start = -1;

                for (int j = 0; j < k; j++) {
                    if (block[j] > block[(j + 1) % k]) {
                        if (start != -1) {
                            start = -2;
                            break;
                        }
                        start = j;
                    }
                }

                if (start == -2) {
                    valid = false;
                    break;
                }

                int first = (start == -1) ? block[0]
                                          : block[(start + 1) % k];

                int last = (start == -1) ? block[k - 1]
                                         : block[start];

                if (first < prevMax) {
                    valid = false;
                    break;
                }

                prevMax = last;
            }

            if (valid) ans += k;
        }

        return ans;
    }
}