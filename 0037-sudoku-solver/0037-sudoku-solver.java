class Solution {

    //empty cell hai ki nahi check krega aur hai toh uski row aur col return krega
    static boolean isEmpty(char[][] board, int[] emptyCell){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    emptyCell[0]=i;
                    emptyCell[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
    //is safe wala function likho
    static boolean isSafe(char[][] board, char charValue,int rowIndex, int colIndex){
        //3 cases hai isme bhi 
        //horizontal check 
        for(int i=0;i<9;i++){
            if(board[rowIndex][i]==charValue){
                return false;
            }
        }
        //vertical check
        for(int i=0;i<9;i++){
            if(board[i][colIndex]==charValue){
                return false;
            }
        }
        //3*3 ke sub boxes me check kro 
        int startRow= rowIndex- rowIndex%3;
        int startCol= colIndex- colIndex%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int actualRow=startRow+i;
                int actualCol=startCol+j;
                if(board[actualRow][actualCol]==charValue){
                    return false;
                }
            }
        }
        //yahan pahuche matlab place krna safe hai;
        return true; 
    }
    static boolean sudokuSolver(char[][] board){
        //base case;
        //agar saare numbers place ho chuke hai
        //matlab koi cell khali nahi hai;
        int[] emptyCell= new int[2];
        if(!isEmpty(board,emptyCell)){
            return true;
        }
        //ab agar empty cell mila toh uska row col pta chale 
        int rowIndex=emptyCell[0];
        int colIndex=emptyCell[1];

        for(int val=1;val<=9;val++){
            char charValue=(char)(val+'0');
            if(isSafe(board,charValue,rowIndex,colIndex)){
                board[rowIndex][colIndex]=charValue;
                //recursion ko dedo
                if(sudokuSolver(board)==true){
                    return true;
                }
                //backtrack kro;
                board[rowIndex][colIndex]='.';
            }
            
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board);
        
    }
}