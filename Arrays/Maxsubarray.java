public class Maxsubarray{
  public static void Maxsubarray(int nums[]){
    //this is use to take -infinity as a input
    int maxSum = Integer.MIN_VALUE;
    
    for(int i=0; i<nums.length;i++){
      int start =i;
      for(int j =i;j<nums.length;j++){
        int end = j;
        int currsum = 0;
        for(int k = start;k<=end;k++){
          currsum +=nums[k];
        }
        System.out.println(currsum);
        if(maxSum<currsum){
          maxSum =currsum;
        }
      }
    }
    System.out.println("maxSum:" + maxSum);
  }
  public static void main(String[] args) {
      int nums[] ={2,4,6,8,10};
      Maxsubarray(nums);
  }
}

//this is not a efficient way of doing Maximum sum of subarray 
//it is because time complexity of this code is O(n^3)..