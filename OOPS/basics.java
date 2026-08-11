// 1)premitive data type is provided by java
// 2)Static keyword (accsess withoud creating Object)
// 3)Multiple Inharetence is npot uses by java
// 4)Operator Ovorloding is not provided in java

// class- blueprint of an object

// object- instance of class

// there are three type of constructor
// default constructor
// class Student {
//     String name;
//     int age;

//     // Default constructor
//     Student() {
//         name = "Unknown";
//         age = 0;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student(); // calls default constructor
//         System.out.println(s1.name + " - " + s1.age);
//     }
// }


// parameter constructor
// class Student {
//     String name;
//     int age;

//     // Parameterized constructor
//     Student(String n1, int a1) {
//         name = n1;
//         age = a1;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Shivani", 20);
//         System.out.println(s1.name + " - " + s1.age);
//     }
// }
// copy consteructor
// class Student {
//     String name;
//     int age;

//     // Parameterized constructor
//     Student(String n2, int a2) {
//         name = n2;
//         age = a2;
//     }

//     // Copy constructor
//     Student(Student s) {
//         name = s.name;
//         age = s.age;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Shivani", 20);
//         Student s2 = new Student(s1); 
//         System.out.println(s2.name + " - " + s2.age);
//     }
// }


// Task

// class StudentReportCard{
//     String name;
//     int studentClass;
//     int averageMarks;
//     String grade;
// }
// public String getName(){
//     return name;
// }
// public int getStudentClass(){
//     return studentClass;
// }
// public int getAveragemarks(){
//     return averageMarks;
// }
// public String getGrade(){
//     return grade;
// }
// public void setName(String name) {
//         this.name = name;
//     }

//     public void setStudentClass(int studentClass) {
//         this.studentClass = studentClass;
//     }

//     public void setAverageMarks(int averageMarks) {
//         this.averageMarks = averageMarks;
//     }

//     public void setGrade(String grade) {
//         this.grade = grade;
//     }

// public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Class: " + studentClass);
//         System.out.println("Average Marks: " + averageMarks);
//         System.out.println("Grade: " + grade);
//     }
// public class basics {
//     public static void main(String[] args) {
//         StudentReportCard s = new StudentReportCard();
//         s.setName("Shivani");
//         s.setStudentClass(10);
//         s.setAverageMarks(85);
//         s.setGrade("A");

//         s.display();
//     }
// }



