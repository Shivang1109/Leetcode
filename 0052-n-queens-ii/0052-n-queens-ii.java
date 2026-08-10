class Solution {

    static boolean isSafe(int rowIndex, int colIndex, char[][] board){
        int n=board.length;
        //sirf 3 cases
        //case1  
        //horizonatal backwards
        int row = rowIndex;
        int col = colIndex;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        //diagonal back upwards;
        row = rowIndex;
        col = colIndex;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        //diagonal back downwards
        row = rowIndex;
        col = colIndex;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;

    }
    static int solve(int n, char[][] board, int colIndex){
        //base case;
        if(colIndex>=n){
            return 1;
        }
        int count=0;
        //current col ke har aek row me jaake Q place kro 
        for(int rowIndex=0; rowIndex<n; rowIndex++){
            if(isSafe(rowIndex,colIndex,board)){
                //place queen if possible;
                board[rowIndex][colIndex]='Q';
                //count to badhao;
                count+=solve(n,board,colIndex+1);
                //backtrack wala step;
                board[rowIndex][colIndex]='.';
            }
        }
        return count;

    }
    
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int res= solve(n,board,0);
        return res;

        
    }
}