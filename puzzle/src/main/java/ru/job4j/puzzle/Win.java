package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i] == 1 && gorizont(board, i) || vertical(board, i)){
                rsl = true ;
            }
        }
        return rsl;
    }

    public static boolean gorizont(int[][] board, int x) {
        boolean a = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i][x] != 1){
                a = false;
                break;
            }
        }
        return a;
    }

    public static boolean vertical(int[][] board, int x) {
        boolean a = true;
        for (int i = 0; i < board.length; i++) {
            if(board[x][i] != 1){
                a = false;
                break;
            }
        }
        return a;
    }
}
