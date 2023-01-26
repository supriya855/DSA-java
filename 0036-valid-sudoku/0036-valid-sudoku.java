class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> row= new HashSet<Character>();
             HashSet<Character> col= new HashSet<Character>();
              HashSet<Character> mat= new HashSet<Character>();

            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&& !row.add(board[i][j]))// here whenever there is a duplicate element the add fuunction return false
                return false;
                 if(board[j][i]!='.'&& !col.add(board[j][i]))
                return false;
                int rowMat=3*(i/3);
                int rowCol=3*(i%3);
                 if(board[rowMat+j/3][rowCol+j%3]!='.'&& !mat.add(board[rowMat+j/3][rowCol+j%3]))
                return false;

            }
        }
        return true;  
             
    }
}
// Intution is that there is no duplicate element in a row col and submatrix(3*3)
// so we are considering three hashset for every row and col and submat
//checking if there is a element in that and there is no duplicate we are checking with all if this condition satisfy return true
//else if there is a element but in an hashset there is a duplicate it returns false coz we are using AND operation
 