public class Swap {
    public static int[] Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      return arr;
    }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int i = 1;
    int j = 3;
    Swap(arr,i,j);
  }
}