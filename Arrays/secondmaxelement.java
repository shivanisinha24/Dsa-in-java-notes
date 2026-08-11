public class secondmaxelement{
  public static void main(String[] args) {
      int[] nums = {1,45,6,57,2,3,25,57,87432,4542};
      int n = nums.length;
      int max = Integer.MIN_VALUE;
      for(int i = 0;i<n;i++){
        if(nums[i]>max){
          max = nums[i];
        }
      }
      int smax = Integer.MIN_VALUE;
      for (int i = 0; i <n; i++) {
        if(nums[i]>smax && nums[i]!=max){
          smax =nums[i];
        }
      }
        System.out.println(max);
        System.out.println(smax);
      }
  }
