
class Integer{
  int value;

  Integer(int value){
    this.value = value;
  }

  void multiple(){
    value*value;
  }

  // void modulo(){
  //   value%value;
  // }

  void display(){
    System.out.println(value);
  }
}

public class wrapper {
    public static void main(String[] args) {
      Integer a = new Integer(100);
      a.multiple();
      a.modulo();
      a.display();
    }
}