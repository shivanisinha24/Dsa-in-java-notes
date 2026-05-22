// switch case: A switch case is a control statement that allows you to execute different blocks of code based on the value of a variable or expression.
// It is an alternative to using multiple if-else statements when you have multiple conditions to check. The switch case statement evaluates the expression and compares it against the specified cases. 
// If a match is found, the corresponding block of code is executed. If no match is found, the default block of code (if provided) is executed.
// in switch cases it use these data types: byte, short, char, int, enum, String and their wrapper classes. 
// It does not support long, float, double and boolean data types. 

// Example of switch case:
public class Switch{
  public static void main(String[] args) {
    switch (day) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break; 
      default:
        System.out.println("Invalid day");
    }
  }
}
