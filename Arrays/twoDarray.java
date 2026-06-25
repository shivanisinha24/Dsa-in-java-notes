// 1D - [1 ,2, 3]
// row - horizontal view, column - vertical view
// 2D - [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// printing 2D array by taking user input
import java.util.Scanner;
public class twoDarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    // input
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    // output
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
