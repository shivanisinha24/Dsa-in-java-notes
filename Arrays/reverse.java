public class reverse {
    public static int[] reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reversedArr = reverse(arr);
        for(int i : reversedArr){
            System.out.print(i + " ");
        }
    }
}