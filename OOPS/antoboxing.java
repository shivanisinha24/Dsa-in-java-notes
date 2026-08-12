public class autoboxing{
  public static void main(String[] args) {
      // auto boxing
      // primitive to wrapper class obj

      int num = 10;
      Integer obj = num;
      // Integer obj = Integer.valueOf(num);
      System.out.println(obj);

      double amount = 99.99;
      Double obj2 = amount;
      // Double obj2 = Double.valueOf(amount);
      System.out.println(obj2);

      // auto unboxing
      // wrapper class obj to primitive
      Integer obj3 = 100;
      int n = obj3;
      // int n = obj3.intValue();
      System.out.println(n);

      Double obj4 = 99.99;
      double value = obj4;
      // int n = obj4.doubleValue();
      System.out.println(value);
    }
}