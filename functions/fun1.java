
// function: A function is a block of code that performs a specific task and can be reused throughout a program. 
// It takes input parameters, processes them, and returns an output. 
// Functions help in breaking down complex problems into smaller, manageable pieces, improving code readability and maintainability. 
// In Java, functions are defined using the method syntax, which includes a return type, method name, parameter list, and method body.

// modularibility: Modularity in programming refers to the design principle of breaking down a program into smaller, self-contained modules or functions that can be developed, tested, and maintained independently.
// Modularity promotes code reusability, improves readability, and makes it easier to manage and



// why functions: Functions are used in programming to promote code reusability, improve readability, and enhance maintainability. 
// They allow developers to break down complex problems into smaller, more manageable pieces, making it easier to understand and debug the code. 
// Functions also help in reducing code duplication, as they can be called multiple times with different inputs, leading to more efficient and cleaner code.


// ACCESS MODIFIER: Access modifiers in Java are keywords that determine the visibility and accessibility of classes, methods, and variables.

// RETURN TYPE: The return type of a function in Java specifies the type of value that the function will return after it has completed its execution.

// PARAMETER: A parameter is a variable that is used to pass information into a function. It is defined in the function's declaration and can be used within the function to perform operations or calculations based on the input provided when the function is called.


// structure of function
// public static returnType functionName(parameter1, parameter2, ...){
//     // function body
//     return value; // if the return type is not void
// }


// function calling
// functionName(argument1, argument2, ...);

// arguments are the actual values that are passed to a function when it is called. They correspond to the parameters defined in the function's declaration and are used to provide input data for the function to process. Arguments can be literals, variables, or expressions, and they are evaluated before being passed to the function. The number and type of arguments must match the parameters defined in the function for it to work correctly.


// non static function we need to create an object of the class to call the function,
//  while static function can be called directly using the class name without creating an object

// this keyword: use to refer to the current instance of the class. 
// It is commonly used to differentiate between instance variables and local variables when they have the same name, 
// to call other constructors in the same class, and to pass the current object as an argument to another method or constructor.

public class fun1 {
    static class Binary {
        public static boolean checkNum(int num) {
            if (num >= 18) {
                return true;
            } else {
                return false;
            }
        }
    }
}
