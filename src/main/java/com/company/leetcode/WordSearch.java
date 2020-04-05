package com.company.leetcode;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                if(dfs(i, j, board, arr, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int colIndex, int rowIndex, char[][] board, char[] word, int letterIndex){
        if(letterIndex == word.length){
            return true;
        }

        boolean result = false;
        if(colIndex >= 0 && colIndex < board.length && rowIndex >= 0 && rowIndex < board[colIndex].length
                && board[colIndex][rowIndex] == word[letterIndex]) {

            board[colIndex][rowIndex] = '.';
            result = dfs(colIndex +1, rowIndex, board, word, letterIndex + 1) ||
                    dfs(colIndex -1, rowIndex, board, word, letterIndex + 1) ||
                    dfs(colIndex, rowIndex+1, board, word, letterIndex + 1) ||
                    dfs(colIndex, rowIndex-1, board, word, letterIndex + 1);
            board[colIndex][rowIndex] = word[letterIndex];
            return result;
        }
        return false;
    }
}
