// OverHiding
class A {
    static void display() {
        System.out.println("Static method from class A");
    }
}
class B extends A {
    static void display() {
        System.out.println("Static method from class B");
    }
}
public class OverHiding {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        a.display();
        b.display(); 
    }
}