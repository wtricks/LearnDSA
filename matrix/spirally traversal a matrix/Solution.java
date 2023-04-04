// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

public class Solution {
    public ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        // base case
        if (matrix == null || r == 0 || c== 0) {
            return result;
        }

        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        int direction = 0, i;
        
        while (top <= bottom && left <= right) {

            // traverse to right
            if (direction == 0) {
                for (i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            } 
            
            // traverse to bottom
            else if (direction == 1) {
                for (i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            } 
            
            // traverse to left
            else if (direction == 2) {
                for (i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            } 
            
            // traverse to top
            else if (direction == 3) {
                for (i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            // change direction
            direction = (direction + 1) % 4;
        }
        
        return result;
    }
}