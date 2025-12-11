import java.util.Scanner;

public class TicTacToe {
    private char[][] board = new char[3][3]; // 3x3 board
    private char currentPlayer = 'X'; // Start with player 'X'

    public void run() {
        Scanner scanner = new Scanner(System.in);
        initializeBoard(); // Set up empty board
        boolean gameWon = false;

        while (!gameWon && !isBoardFull()) {
            printBoard(); // Display current board
            playerMove(scanner); // Get player input
            gameWon = checkWin(); // Check if the player won
            if (!gameWon) {
                switchPlayer(); // Change turn
            }
        }
        
        printBoard(); // Show final board state
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        scanner.close();
    }

    // Initializes the board with empty spaces
    public void initializeBoard() {
        // TODO: Fill this function to initialize the board with '-'
    	  for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  board[i][j] = '-';
              }
          }
    }

    // Prints the board
    public void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Handles player move input
    public void playerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter row and column (0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }


    // Switches to the next player
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Checks if the board is full (tie condition)
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Checks if a player has won
    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        
        return false;
    }
}
