class Animal{
    void sound(){
    System.out.println("hii, Human");
    }
  }

  class Lion extends Animal{
    @Override
    void sound(){
    System.out.println("Hii form Jungle King");
    }
  }
public class Overriding{
  public static void main(String[] args) {
    Animal a = new Lion();
    a.sound();
    Animal b = new Animal();
    b.sound();
    Lion lion = new Lion();
    lion.sound();
  }
}