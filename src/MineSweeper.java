import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class MineSweeper {
    int rowNumber, colNumber,size;
    String[][] map;
    String[][] board;
    boolean isGame = true;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map =new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }

    public void run() {
        int row, col;
        prepareGame();
        board();
        print(map);
        System.out.println("========");
        while(isGame) {
            print(board);
            System.out.println("Row: ");
            row = sc.nextInt();
            System.out.println("Col: ");
            col = sc.nextInt();
            if(map[row][col]!="*"){
                checkMine(row,col);
            }

        }
    }
    void checkMine(int row, int col) {
        int count = 0;
        if(map[row][col+1] == "*"){
            count++;
            board[row][col] = Integer.toString(count);
        }
        if(map[row+1][col] == "*"){
            count++;
            board[row][col] = Integer.toString(count);
        }
        if(map[row-1][col] == "*"){
            count++;
            board[row][col] = Integer.toString(count);
        }
        if(map[row][col-1] == "*"){
            count++;
            board[row][col] = Integer.toString(count);
        }
        else{
            board[row][col] = Integer.toString(count);
        }
    }
    public void board() {
        for(int i=0; i<rowNumber; i++){
            for(int j=0; j<colNumber; j++){
            board[i][j] = "-";
            }
    }
    }
    public void prepareGame() {
        int randRow, randCol, count = 0;
        for(int i=0; i<rowNumber; i++){
            for(int j=0; j<colNumber; j++){
                map[i][j] = "-";
            }
           
        }
        while(count!=size/4) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != "*"){ //If no mines are placed at this location, define a mine at this location.
               map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    public void print(String[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

