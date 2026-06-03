// array:

//why do we mneed array: easy to manage

// declaration of array
// int [] arr;

// initialisation of array
// int[] arr = {23450};

// arr.length: it use to represent the size of an array

// array is 0 base indexing

// travaersal of array:
import java.util.*;
public class basic_Array{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("");
    for(int i=0; i<n; i++){
        if(i%2==0){
        System.out.println(arr[i]);
        }
    }
  } 
}

