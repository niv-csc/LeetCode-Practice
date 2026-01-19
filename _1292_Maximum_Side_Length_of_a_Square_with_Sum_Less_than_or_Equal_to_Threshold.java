class _1292_Maximum_Side_Length_of_a_Square_with_Sum_Less_than_or_Equal_to_Threshold{
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;

        // Build prefix sum matrix
        int[][] prefix = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i-1][j-1] //addinh=g ze elements here (pre made matrix sort)
                        + prefix[i-1][j]
                        + prefix[i][j-1]
                        - prefix[i-1][j-1];
            }
        }

        int maxLen = 0;
        // Trying all possible side lengths
        for (int len = 1; len <= Math.min(m, n); len++) {
            boolean found = false;
            for (int i = len; i <= m; i++) {
                for (int j = len; j <= n; j++) {
                    int sum = prefix[i][j]
                            - prefix[i-len][j]
                            - prefix[i][j-len]
                            + prefix[i-len][j-len];
                    if (sum <= threshold) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) maxLen = len;
        }

        return maxLen;
    }
}
