class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }

    int rows = matrix.length;
    int cols = matrix[0].length;

    int start = 0;
    int end = (rows * cols) - 1;
while(start<=end){
   int mid=start+(end-start)/2;
   int val =matrix[mid/cols][mid%cols];
        
        if (val == target) return true;
        if (val < target) start = mid + 1;
        else end = mid - 1;
}
 return false;
    }
}
