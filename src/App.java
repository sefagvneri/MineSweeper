import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Welcome to the Mine Sweeper");
        System.out.println("Enter the dimensions you want to play with. ");
        System.out.println("Enter the row number: ");
        row = sc.nextInt();
        System.out.println("Enter the col number: ");
        col = sc.nextInt();
        
    
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
        
        

    }
}
