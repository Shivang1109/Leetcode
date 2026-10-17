class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        // Sort by digit sum, then by actual value
        Arrays.sort(arr, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);

            if (sumA != sumB) {
                return sumA - sumB;
            }
            return a - b;
        });

        // Map each number to its target index
        Map<Integer, Integer> target = new HashMap<>();

        for (int i = 0; i < n; i++) {
            target.put(arr[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Count permutation cycles
        for (int i = 0; i < n; i++) {
            if (visited[i] || target.get(nums[i]) == i) {
                visited[i] = true;
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = target.get(nums[j]);
                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}