public class insertion{
  public static void main(String[] args){
    int[] arr ={4,7,3,20,8,2,0,9,6,5,1};
    for(int i=1;i<arr.length;i++){
      int j=i;
      while(j>0 && arr[j]<arr[j-1]){
        int temp =arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
    for(int ele:arr)System.out.print(ele+" ");
  }
}