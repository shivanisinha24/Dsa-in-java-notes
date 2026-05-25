
// function: A function is a block of code that performs a specific task and can be reused throughout a program. 
// It takes input parameters, processes them, and returns an output. 
// Functions help in breaking down complex problems into smaller, manageable pieces, improving code readability and maintainability. 
// In Java, functions are defined using the method syntax, which includes a return type, method name, parameter list, and method body.

// modularibility: Modularity in programming refers to the design principle of breaking down a program into smaller, self-contained modules or functions that can be developed, tested, and maintained independently.
// Modularity promotes code reusability, improves readability, and makes it easier to debug



// why functions: Functions are used in programming to promote code reusability, improve readability, and enhance maintainability. Easy to debug and test. 
// They allow developers to break down complex problems into smaller, more manageable pieces, making it easier to understand and debug the code. 
// Functions also help in reducing code duplication, as they can be called multiple times with different inputs, leading to more efficient and cleaner code.

// componenets of functions:

// ACCESS MODIFIER: Access modifiers in Java are keywords that determine the visibility and accessibility of classes, methods, and variables.

// RETURN TYPE: The return type of a function in Java specifies the type of value that the function will return after it has completed its execution.

// PARAMETER: A parameter is a variable that is used to pass information into a function. It is defined in the function's declaration and can be used within the function to perform operations or calculations based on the input provided when the function is called.

// Parameters passed to the method
// Local variables declared inside the method
// Sometimes temporary values used during execution


// context of the functions:

// local scope: we can access this throuout the function
// global scope: variable declared in main function 
// block scope: block of code writen in local function that we can't access throuout the function
// lexical scoping:

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

// stack memory use to store static element.it store adress memory

// heep memory use to store dynamic data,objects, runtime. persistent 

// stack memory is works on LIFO principal

// local variable table:It’s part of the stack frame created when a method is invoked.

// The table stores:
// Parameters passed to the method
// Local variables declared inside the method
// Sometimes temporary values used during execution

//call by value:permitive data type is used. function call by value

// pass by reference: non-premitive data type is used.

// Types of functions: 
// paramiterised function
// non parameterised functions
// recursive function : function calling itself within its own body.

//Difference between parameter and arguments
// Parameter:
// Definition: Variables defined in the method signature.
// Purpose: Act as placeholders to receive values when the method is called

// Arguments
// Definition: Actual values or expressions passed to the method when it is invoked.
// Purpose: Supply real data to the parameters.


// function overloading: same function name but different parameters
// function overridding: same function name but cna done in different or subclass.

// @overide:it is an annotation in Java.