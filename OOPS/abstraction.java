abstract class Application{
  abstract void temprature();
}
class Aircondition extends Application{
  void temprature(){
    System.out.println("18 degree");
  }
}
public class abstraction{
  public static void main(String[] args) {
      Application a = new Aircondition();
      a.temprature();
  }
}