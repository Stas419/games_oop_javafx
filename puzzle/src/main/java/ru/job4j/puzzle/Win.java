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

    public static boolean monoGorizont(int[][] board, int column) {
        boolean a = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i][column] != 1){
                a = false;
                break;
            }
        }
        return a;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean a = true;
        for (int i = 0; i < board.length; i++) {
            if(board[column][i] != 1){
                a = false;
                break;
            }
        }
        return a;
    }
}
