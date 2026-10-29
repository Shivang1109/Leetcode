import java.util.*;

class Solution {
    private int n;
    private List<Integer>[] adj;
    private int[] parent, depth, size, heavy, head, pos;
    private int[] bit, charMask;
    private int[][] up;
    private int currentPos;

    public List<Boolean> palindromePath(
            int n, int[][] edges, String s, String[] queries) {

        this.n = n;
        adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        parent = new int[n];
        depth = new int[n];
        size = new int[n];
        heavy = new int[n];
        head = new int[n];
        pos = new int[n];
        charMask = new int[n];

        Arrays.fill(heavy, -1);

        int LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        up = new int[LOG][n];

        for (int i = 0; i < n; i++) {
            charMask[i] = 1 << (s.charAt(i) - 'a');
        }

        currentPos = 0;
        dfs(0, -1, 0);

        currentPos = 0;
        decompose(0, 0);

        for (int i = 0; i < n; i++) {
            up[0][i] = (parent[i] == -1) ? i : parent[i];
        }

        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i < n; i++) {
                up[j][i] = up[j - 1][up[j - 1][i]];
            }
        }

        bit = new int[n + 1];

        for (int i = 0; i < n; i++) {
            add(pos[i], charMask[i]);
        }

        List<Boolean> answer = new ArrayList<>();

        for (String q : queries) {
            String[] parts = q.split(" ");
            int u = Integer.parseInt(parts[1]);

            if (parts[0].equals("update")) {
                char c = parts[2].charAt(0);
                int newMask = 1 << (c - 'a');

                if (charMask[u] != newMask) {
                    add(pos[u], charMask[u] ^ newMask);
                    charMask[u] = newMask;
                }
            } else {
                int v = Integer.parseInt(parts[2]);
                int mask = queryPath(u, v);

                answer.add((mask & (mask - 1)) == 0);
            }
        }

        return answer;
    }

    private int dfs(int u, int p, int d) {
        parent[u] = p;
        depth[u] = d;
        size[u] = 1;

        int maxSize = 0;

        for (int v : adj[u]) {
            if (v == p) {
                continue;
            }

            int childSize = dfs(v, u, d + 1);
            size[u] += childSize;

            if (childSize > maxSize) {
                maxSize = childSize;
                heavy[u] = v;
            }
        }

        return size[u];
    }

    private void decompose(int u, int h) {
        head[u] = h;
        pos[u] = currentPos++;

        if (heavy[u] != -1) {
            decompose(heavy[u], h);
        }

        for (int v : adj[u]) {
            if (v == parent[u] || v == heavy[u]) {
                continue;
            }

            decompose(v, v);
        }
    }

    private void add(int index, int value) {
        for (int i = index + 1; i <= n; i += i & -i) {
            bit[i] ^= value;
        }
    }

    private int prefixQuery(int index) {
        int result = 0;

        for (int i = index + 1; i > 0; i -= i & -i) {
            result ^= bit[i];
        }

        return result;
    }

    private int rangeQuery(int left, int right) {
        if (left > right) {
            return 0;
        }

        return prefixQuery(right)
                ^ (left == 0 ? 0 : prefixQuery(left - 1));
    }

    private int queryPath(int u, int v) {
        int result = 0;

        while (head[u] != head[v]) {
            if (depth[head[u]] < depth[head[v]]) {
                int temp = u;
                u = v;
                v = temp;
            }

            result ^= rangeQuery(pos[head[u]], pos[u]);
            u = parent[head[u]];
        }

        if (depth[u] > depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        result ^= rangeQuery(pos[u], pos[v]);

        return result;
    }

    private int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < up.length; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[j][u];
            }
        }

        if (u == v) {
            return u;
        }

        for (int j = up.length - 1; j >= 0; j--) {
            if (up[j][u] != up[j][v]) {
                u = up[j][u];
                v = up[j][v];
            }
        }

        return parent[u];
    }
}