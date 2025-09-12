package Basic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame implements ActionListener {
    JButton[][] buttons = new JButton[3][3];
    char[][] board = new char[3][3];
    char human = 'X';
    char ai = 'O';

    public TicTacToeGUI() {
        setTitle("Tic-Tac-Toe AI");
        setSize(400, 400);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize buttons and board
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
                board[i][j] = ' ';
            }
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(buttons[i][j] == clicked && board[i][j] == ' ') {
                    makeMove(i, j, human);
                    if(checkWinner(human)) {
                        JOptionPane.showMessageDialog(this, "You beat the AI! 🎉");
                        resetBoard();
                        return;
                    }
                    if(isDraw()) {
                        JOptionPane.showMessageDialog(this, "It's a Draw!");
                        resetBoard();
                        return;
                    }

                    aiMove();
                    if(checkWinner(ai)) {
                        JOptionPane.showMessageDialog(this, "AI Wins! I got outsmarted! 😱");
                        resetBoard();
                        return;
                    }
                    if(isDraw()) {
                        JOptionPane.showMessageDialog(this, "It's a Draw!");
                        resetBoard();
                        return;
                    }
                }
            }
        }
    }

    void makeMove(int row, int col, char player) {
        board[row][col] = player;
        buttons[row][col].setText(String.valueOf(player));
    }

    void aiMove() {
        int[] move = findBestMove();
        makeMove(move[0], move[1], ai);
    }

    boolean checkWinner(char player) {
        for(int i=0;i<3;i++) {
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player) return true;
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player) return true;
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player) return true;
        return false;
    }

    boolean isDraw() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==' ') return false;
        return true;
    }

    int[] findBestMove() {
        // 1. Check if AI can win
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==' ') {
                    board[i][j] = ai;
                    if(checkWinner(ai)) return new int[]{i,j};
                    board[i][j] = ' ';
                }

        // 2. Block human win
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==' ') {
                    board[i][j] = human;
                    if(checkWinner(human)) {
                        board[i][j]=' ';
                        return new int[]{i,j};
                    }
                    board[i][j]=' ';
                }

        // 3. Else, pick first empty
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==' ') return new int[]{i,j};

        return null;
    }

    void resetBoard() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                board[i][j] = ' ';
                buttons[i][j].setText("");
            }
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
