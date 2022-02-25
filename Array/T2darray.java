package Array;
import java.util.Scanner;

public class T2darray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // Rows
        for(int i=0; i<rows; i++) {
            // Columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0; i<rows; i++) {
            // Columns
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
