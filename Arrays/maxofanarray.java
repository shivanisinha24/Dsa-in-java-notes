public class maxofanarray{
  public static void main(String args[]){
    int[] nums ={1000,20,39,395,23,24,3245556};
    int n = nums.length;
    int max = nums[0];
    for(int i =0;i<n;i++){
      if (nums[i]>max) {
        max = nums[i];
      }
    }
    System.out.println(max);
  }
}