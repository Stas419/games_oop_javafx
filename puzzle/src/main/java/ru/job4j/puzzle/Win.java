package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] == 1 && (monoGorizont(board, i) || monoVertical(board, i))){
                rsl = true ;
            }
        }
        return rsl;
    }

    public static boolean monoGorizont(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i][row] != 1){
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if(board[column][i] != 1){
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
