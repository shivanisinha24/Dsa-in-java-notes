import java.util.*;
public class linearsearch{
  public static boolean linearsearch(int n){
    int[] arr = {1,2,3,4,5};
    for(int i=0; i<arr.length; i++){
      if(arr[i]==n){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(linearsearch(n));
  }
}