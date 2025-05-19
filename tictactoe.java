import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char board[][] = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        boolean gameOver = false;
        char player='X';
       while(!gameOver){
        printBoard(board);
        System.out.println("Player"+player+" enter row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        if(board[row][col]=='_'){
            board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won");
                    printBoard(board);
                    break;
                }
                else{
                    player=(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid move");
            }
    }}
    public static Boolean haveWon(char[][] board,char player) {
        //check rows
        for (int i = 0; i <3; i++) {
            if(board[i][0]==player&&board[i][1]==player && board[i][2]==player){
                return true;
            }
        }
        //check columns
        for (int i = 0; i <3; i++) {
            if(board[0][i]==player&&board[1][i]==player && board[2][i]==player){
                return true;
            }}

        //check diagonals
            if(board[0][0]==player&&board[1][1]==player && board[2][2]==player){
                return true;
            }
            if(board[0][2]==player&&board[1][1]==player && board[2][0]==player){
                return true;
            }
            return false;
    }
    public static void printBoard(char board[][]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
