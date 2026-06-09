class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rowwise = new int[9][9];
        int[][] colwise = new int[9][9];
        int[][] gridwise = new int[9][9];
        for(int i = 0  ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j]!='.'){
                    int num = board[i][j] - '0';

                    int k = i/3*3 + j/3;
                    if(rowwise[i][num-1]++ > 0 || colwise[j][num-1]++ > 0 || gridwise[k][num-1]++ > 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}