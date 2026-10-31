class Solution {
    static final int MOD = 1_000_000_007;

    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][][] dp = new long[m][n][2];

        // Direction 0 = Right, Direction 1 = Down
        dp[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int d = 0; d < 2; d++) {

                    long ways = dp[i][j][d];
                    if (ways == 0) continue;

                    // Try moving right
                    int x = i;
                    int y = j + 1;
                    int dir = 0;

                    while (x < m && y < n && grid[x][y] == 1) {
                        if (dir == 0) {
                            x++;
                            dir = 1;
                        } else {
                            y++;
                            dir = 0;
                        }
                    }

                    if (x < m && y < n) {
                        dp[x][y][dir] =
                            (dp[x][y][dir] + ways) % MOD;
                    }

                    // Try moving down
                    x = i + 1;
                    y = j;
                    dir = 1;

                    while (x < m && y < n && grid[x][y] == 1) {
                        if (dir == 0) {
                            x++;
                            dir = 1;
                        } else {
                            y++;
                            dir = 0;
                        }
                    }

                    if (x < m && y < n) {
                        dp[x][y][dir] =
                            (dp[x][y][dir] + ways) % MOD;
                    }
                }
            }
        }

        return (int) ((dp[m - 1][n - 1][0] +
                       dp[m - 1][n - 1][1]) % MOD);
    }
}