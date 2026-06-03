public class Rotatearratx {
    public static int[] Rotatearratx(int[] arr, int k){
        int n = arr.length;
        k = k % n; 
        int[] rotatedArr = new int[n];
        
        for(int i = 0; i < n; i++){
            rotatedArr[(i + k) % n] = arr[i];
        }
        
        return rotatedArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] rotatedArr = Rotatearratx(arr, k);
        for(int i : rotatedArr){
            System.out.print(i + " ");
        }
    }
}