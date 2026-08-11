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

class Puppy extends Dog{
  Puppy(){
    System.out.println("Puppy constructor");
  }
}
class Plumo extends Puppy{
  Plumo(){
    System.out.println("Puppy1 constructor");
  }
}
public class multilevel {
    public static void main(String[] args) {
      Animal a = new Plumo();
      System.out.println();
    }
}