public class pattern8{
  public static void main(String[] args) {
      int n = 3;
      for (int i =n; i>0; i--) {
        for (int j=0; j <= n-i; j++) {
              System.out.print(" ");
          }
          for(int j=i;j>0;j--){
            System.out.print("*"+" ");
          }
          System.out.println();
      }
  }
}
