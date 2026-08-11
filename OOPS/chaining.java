
// class Student{
//   String name;
//   int roll;

//   Student(){
//     this("shivani", 200);
//   }

//   Student(String name, int roll){
//     this.name = name;
//     this.roll = roll;
//   }
// }

// public class chaining {
//     public static void main(String[] args) {
//       Student s = new Student();
//       System.out.println(s.name);
//     }
// }

// Constructor chaining avoids code duplication.
// this() chains constructors within the same class.
// super() chains constructors between parent and child classes.
// Both must be the first statement in a constructor
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

public class chaining {
    public static void main(String[] args) {
      Animal a = new Dog();
      System.out.println();
    }
}