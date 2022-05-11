package com.problemsolving.graph;

public class BattleshipsInABoard {

    public int countBattleships(char[][] board) {
        int num = 0;

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                num += sink(board, i, j);

        return num;
    }

    int sink(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '.')
            return 0;

        board[i][j] = '.';

        sink(board, i, j + 1);
        sink(board, i, j - 1);
        sink(board, i + 1, j);
        sink(board, i - 1, j);

        return 1;
    }

    //////////////////////////////

    public int countBattleships2(char[][] board) {
        int numOfBattleShips = 0;

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (i > 0 && board[i - 1][j] == 'X')
                    continue;
                if (j > 0 && board[i][j - 1] == 'X')
                    continue;
                numOfBattleShips++;
            }

        return numOfBattleShips;
    }

}
