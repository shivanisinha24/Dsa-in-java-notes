class Student{
    int enrollment;
    int age;
    Student(){
        this.enrollment = 1234;
        this.age = 20;
    }
}
class Shivani extends Student{
    Shivani(){
        super();
        System.out.println(enrollment);
        System.out.println(age);
    }
}
class shaswat extends Student{
    shaswat(){
        super();
        System.out.println(enrollment);
        System.out.println(age);
    }
} 
public class herarchical {
    public static void main(String[] args) {
        Shivani s = new Shivani();
        shaswat sh = new shaswat();
        System.out.println();
    }
}