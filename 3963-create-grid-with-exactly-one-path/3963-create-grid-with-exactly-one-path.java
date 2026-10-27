class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        StringBuilder firstRow = new StringBuilder();
        for(int i=1;i<=n;i++){
            firstRow.append(".");
        }
        arr[0] = firstRow.toString();
        for(int i=1;i<m;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=1;j<n;j++){
                sb.append("#");
            }
            sb.append(".");
            arr[i] = sb.toString();
        }
        return arr;
    }
}