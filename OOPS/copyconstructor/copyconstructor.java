class Student {
    int id;
    String name;

    // creating a parameterized constructor
    Student(int i, String n) {
        this.id = i;
        this.name = n;
    }

    // creating a copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}
public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(s1);
        s2.name = "Shivani";
        s2.display();
    }
}