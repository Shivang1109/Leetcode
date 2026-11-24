class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 2;

        for (int i = 0; i < n; i++) {

            int used = getMask(nums[i]);
            boolean conflict = false;

            for (int j = i + 1; j < n; j++) {

                int mask = getMask(nums[j]);

                if (j == i + 1) {
                    if ((used & mask) != 0) {
                        conflict = true;
                    }

                    used |= mask;
                    ans = Math.max(ans, 2);
                    continue;
                }

                if (conflict || (used & mask) != 0) {
                    break;
                }

                used |= mask;
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }

    private int getMask(int num) {
        int mask = 0;

        if (num % 2 == 0) mask |= 1;
        if (num % 3 == 0) mask |= 2;
        if (num % 5 == 0) mask |= 4;
        if (num % 7 == 0) mask |= 8;

        return mask;

    }
}