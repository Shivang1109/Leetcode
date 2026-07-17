class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int rowIndex=0;
        int colIndex=col-1;
        while(colIndex>=0 && rowIndex<row){
            int start=matrix[rowIndex][colIndex];
            if(start==target){
                return true;
            }
            else if(start>target){
                //left jao 
                colIndex--;

            }
            else{
                //neeche jao
                rowIndex++; 
            }
           
        }
        return false;   
    }
}