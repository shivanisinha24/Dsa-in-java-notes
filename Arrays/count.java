package Arrays;
import java.util.*;
public class count{
  public static int count(int [] arr, int n){
    int count = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<n){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter a number: ");
    for(int i = 0;i<n;i++){
      arr[i]= sc.nextInt();
  }
  System.out.println(count(arr, 5));
}
}