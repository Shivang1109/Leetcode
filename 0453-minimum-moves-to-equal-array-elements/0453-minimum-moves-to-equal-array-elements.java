class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        // Find minimum element
        for (int num : nums) {
            min = Math.min(min, num);
        }

        int moves = 0;

        // Calculate total difference
        for (int num : nums) {
            moves += num - min;
        }

        return moves;
    }
}