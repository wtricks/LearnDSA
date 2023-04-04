// https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = (col*row) - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int r = mid / col; // 11 / 4 -> 2
            int c = mid % col; // 11 % 3 -> 3

            if (matrix[r][c] == target) return true;
            if (matrix[r][c] > target) end = mid - 1;
            else start = mid + 1;
        }

        return false;
    }
}