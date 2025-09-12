package Basic;
// TicToe.java// A simple Tic Tac Toe game in Java where a human plays against a basic AI.
// The AI uses a simple strategy to either win, block the human player, or make a random move.

import java.util.Scanner;

public class TicToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    static char human = 'X';
    static char ai = 'O';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printBoard();
        
        while (true) {
            humanMove(sc);
            printBoard();
            if (isWinner(human)) {
                System.out.println("Congrats! You beat the AI! 🎉");
                break;
            }
            if (isDraw()) {
                System.out.println("It's a Draw!");
                break;
            }

            aiMove();
            printBoard();
            if (isWinner(ai)) {
                System.out.println("AI Wins! I got outsmarted! 😱");
                break;
            }
            if (isDraw()) {
                System.out.println("It's a Draw!");
                break;
            }
        }
        sc.close();
    }

    // Print current board state
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Human move
    static void humanMove(Scanner sc) {
        int row, col;
        while (true) {
            System.out.print("Enter row (0-2) and column (0-2): ");
            row = sc.nextInt();
            col = sc.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = human;
                break;
            } else {
                System.out.println("Cell already occupied! Try again.");
            }
        }
    }

    // AI move using simple strategy
    static void aiMove() {
        int[] bestMove = findBestMove();
        board[bestMove[0]][bestMove[1]] = ai;
        System.out.println("AI placed O at (" + bestMove[0] + ", " + bestMove[1] + ")");
    }

    // Check winner
    static boolean isWinner(char player) {
        // Check rows, columns, diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0]==player && board[i][1]==player && board[i][2]==player) return true;
            if (board[0][i]==player && board[1][i]==player && board[2][i]==player) return true;
        }
        if (board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
        if (board[0][2]==player && board[1][1]==player && board[2][0]==player) return true;
        return false;
    }

    // Check draw
    static boolean isDraw() {
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                if (board[i][j]==' ') return false;
        return true;
    }

    // Simple AI logic: win if possible, block human, else random
    static int[] findBestMove() {
        // 1. Check if AI can win
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (board[i][j]==' ') {
                    board[i][j]=ai;
                    if (isWinner(ai)) return new int[]{i,j};
                    board[i][j]=' ';
                }
            }
        }
        // 2. Block human win
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (board[i][j]==' ') {
                    board[i][j]=human;
                    if (isWinner(human)) {
                        board[i][j]=' ';
                        return new int[]{i,j};
                    }
                    board[i][j]=' ';
                }
            }
        }
        // 3. Else, pick first empty
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                if (board[i][j]==' ') return new int[]{i,j};
        return null;
    }
}

