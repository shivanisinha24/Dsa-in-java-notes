public class frequency_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int n = nums.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    freq[j] = 0;
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(nums[i]  + freq[i]);
            }
        }
    }
}