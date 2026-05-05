class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }

    int row = 0;
    int col = 0;
    int m = matrix.length;
    int n = matrix[0].length;

    // 1. Find the correct row
    // We check matrix[row][0] to see if the target COULD be in this row.
    // We must stop BEFORE row reaches m to avoid index errors.
    while (row < m && matrix[row][0] <= target) {
        row++;
    }
    
    // After the loop, row is at the first row that starts with a value TOO BIG.
    // So we move back one row to find where the target actually sits.
    row--;

    // EDGE CASE: If the target is smaller than the very first element in the matrix,
    // row will become -1. We must catch this.
    if (row < 0) return false;

    // 2. Find the correct column in that row
    while (col < n && matrix[row][col] < target) {
        col++;
    }

    // 3. Final Check
    // Check if we found it and ensure col hasn't run off the edge.
    if (col < n && matrix[row][col] == target) {
        return true;
    }

    return false;

    }
}
