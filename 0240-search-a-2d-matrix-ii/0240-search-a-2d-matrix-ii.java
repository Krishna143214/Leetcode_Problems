class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int col=matrix[0].length-1;
        
        while(r<matrix.length&&col>=0){
            if(matrix[r][col]==target){
                return true;
            }
            else if(matrix[r][col]>target){
                col--;
            }
            else{
                r++;
            }
        }
        
        return false;
        
    }
}