public class Subarray{
  public static int[] Subarray(int[] arr, int start, int end){
    int[] subarr = new int[end - start + 1];
    for(int i = start; i <= end; i++){
        subarr[i - start] = arr[i];
    }
    return subarr;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int start = 1;
    int end = 3;
    int[] subarr = Subarray(arr,start,end);
    for(int i : subarr){
        System.out.print(i + " ");
    }
  }
}