class calculator{
  int  sub(int a, int b){
    return a-b;
  }
  double sub(double a, double b){
    return a-b;
  }
  long sub(long a, long b){
    return a-b;
  }
}
public class Polymorphisam{
  public static void main(String[] args) {
      calculator c = new calculator();
      int ans = c.sub(7,9);
      System.out.println(ans);
      double ans2 =c.sub(31.34,32.45);
      System.out.println(ans2);
  }
}

