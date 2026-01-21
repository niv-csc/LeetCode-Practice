class _3000_Maximum_Area_of_Longest_Diagonal_Rectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0.0;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double diagonal = Math.sqrt((l * l) + (w * w));
            int area = l * w;
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                //picking ze larger area
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}