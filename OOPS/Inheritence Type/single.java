class Animal{
  Animal(String name){
    System.out.println("Animal constructor");
    System.out.println(name);
  } 
}
class Dog extends Animal{
  Dog(){
    super("Tommy");
    System.out.println("Dog constructor");
  }
}

public class single {
    public static void main(String[] args) {
      Animal a = new Dog();
      System.out.println();
    }
}