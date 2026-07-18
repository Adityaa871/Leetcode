class Solution {
   public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }

    public boolean solve(char [][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    char x = board[i][j];

                    // removing the character
                    board[i][j] = '.';
                    if(!isValid(board,i,j,x)){
                        return false;
                    }
                    // putting the char back
                    board[i][j] = x;
                }
            }
        }
        return true;
    }

    public boolean isValid(char [][] board, int row, int col, char c){
        for(int i=0; i<9; i++){
            // checking for row
            if(board[i][col] == c){
                return false;
            }

            // col
            if(board[row][i] == c){
                return false;
            }

            // 3X3 wali matrix ki baat
            if(board[3 * (row /3) + i/3][3 * (col/3) + i%3] == c){
                return false;
            }
        }
        return true;
    }
}