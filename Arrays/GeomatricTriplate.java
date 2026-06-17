public class GeomatricTriplate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16};
        int count = countGeometricTriplets(arr);
        System.out.println("Number of geometric triplets: " + count);
    }

    public static int countGeometricTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}