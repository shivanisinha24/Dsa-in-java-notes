// Notes on Java concepts:

// Data types:
// range of data types:
// byte: -128 to 127
// short: -32,768 to 32,767
// char: 0 to 65,535
// int: -2,147,483,648 to 2,147,483,647
// long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float: 1.4E-45 to 3.4028235E38
// double: 4.9E-324 to 1.7976931348623157E308
// boolean: true or false

// short cuircitingt: if the evaluation of a logical expression exits in between before complete evaluation, 
// then it is known as Short-circuit. A short circuit happens because the result is clear even before the complete evaluation of the expression,
// and the result is returned. Short circuit evaluation avoids unnecessary work and leads to efficient processing.

// In pre-increment, the value of the variable is incremented first, and then the updated value is used in the expression.

// In post-increment, the current value of the variable is used in the expression first, and then the variable is incremented.

// In pre-decrement, the value of the variable is decremented first, and then the updated value is used in the expression.


// In post-decrement, the current value of the variable is used in the expression first, and then the variable is decremented.
// programming: the set of instruction that a computer can understand and execute. It is the process of designing, writing, testing, debugging, and maintaining the source code of computer programs.

// what is java: a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is widely used for developing applications, web applications, and mobile applications. Java is known for its portability, security, and robustness. It is platform-independent, meaning that Java code can run on any device that has a Java Virtual Machine (JVM) installed. 

// why java: Java is a popular programming language that offers several advantages, including platform independence, strong memory management, a large standard library, and a vibrant community. It is widely used in various domains such as web development, mobile app development, enterprise applications, and more. Java's "write once, run anywhere" philosophy allows developers to create applications that can run on different platforms without modification, making it a versatile choice for many projects.

// why java is not purely object-oriented: Java is not considered a purely object-oriented programming language because it includes primitive data types (such as int, char, boolean, etc.) that are not objects. In a purely object-oriented language, everything would be an object, and there would be no distinction between primitive types and objects. 
// However, Java provides wrapper classes (such as Integer, Character, Boolean, etc.) that allow you to treat primitive types as objects when needed. This design choice allows Java to be more efficient in terms of memory and performance while still providing the benefits of object-oriented programming.

// how java is platform independent: Java is platform independent because it uses a virtual machine (JVM) to execute Java bytecode. When you compile a Java program, it is converted into bytecode, 
// which is a platform-neutral intermediate representation of the code. The JVM then interprets or compiles this bytecode into machine code that can be executed on the specific platform. 
// This means that you can write a Java program once and run it on any device that has a compatible JVM, regardless of the underlying hardware or operating system.

//implicit type conversion: Implicit type conversion, also known as automatic type conversion or type coercion, is a process in which the Java compiler automatically converts one data type to another when necessary. 
// This typically happens when you perform operations on different data types or when you assign a value of one type to a variable of another type.
// explicit type conversion: Explicit type conversion, also known as type casting, is a process in which you manually convert one data type to another in Java. 
// This is done using a cast operator, which is a pair of parentheses containing the target data type before the value you want to convert.

// why java is robust: Java is considered a robust programming language because it has several features that contribute to its reliability and stability. These features include strong memory management, exception handling, type checking, and garbage collection.
// Java's strong memory management helps prevent memory leaks and ensures that memory is allocated and deallocated efficiently. Exception handling allows developers to handle errors gracefully and maintain the stability of the application. Type checking helps catch errors at compile time, reducing the likelihood of runtime errors. Garbage collection automatically manages memory by reclaiming unused objects, which helps prevent memory-related issues and improves overall robustness.
// java include these features for robustness: strong memory management, exception handling, type checking, Security, and garbage collection. These features work together to ensure that Java applications are reliable, stable, and less prone to errors, making Java a robust programming language.

// collboration: Collaboration in programming refers to the process of working together with other developers, designers, and stakeholders to create software applications. It involves sharing ideas, code, and resources to achieve common goals. 
// Collaboration can take place through various means, such as version control systems (like Git), communication tools (like Slack or Microsoft Teams), and project management platforms (like Jira or Trello). Effective collaboration can lead to improved code quality, faster development cycles, and a more cohesive team dynamic.

// exception handling: Exception handling in Java is a mechanism to handle runtime errors or exceptional conditions gracefully. It allows developers to write code that can catch and handle exceptions, preventing the program from crashing and providing a way to recover from errors.
// In Java, exceptions are represented by the Throwable class and its subclasses. The main types of exceptions are checked exceptions (which must be declared in the method signature or handled with a try-catch block) and unchecked exceptions (which do not require explicit handling).
// The try-catch block is used to handle exceptions. The code that may throw an exception

// type checking: Type checking in Java is the process of verifying that the types of variables, expressions, and method calls are consistent with the expected types. Java is a statically-typed language, which means that type checking is performed at compile time.

// garbage collection: Garbage collection in Java is the process of automatically reclaiming memory that is no longer in use by the program. The Java Virtual Machine (JVM) manages memory and performs garbage collection to free up memory occupied by objects that are no longer referenced by the program.

// hello +5+5= hello55 it is because of string concatenation. When you use the + operator with a string and another data type, Java converts the other data type to a string and concatenates it with the original string. In this case, the number 5 is converted to the string "5" and concatenated with "hello", resulting in "hello55". If you want to perform addition instead of concatenation, you can use parentheses to ensure that the addition is performed before concatenation, like this: "hello" + (5 + 5), which will result in "hello10".

// 5+5+"hello" it is because of operator precedence. In this case, the addition operation is performed first, resulting in 10, and then the string "hello" is concatenated with the result, resulting in "10hello". If you want to perform concatenation first, you can use parentheses to ensure that the concatenation is performed before addition, like this: "hello" + (5 + 5), which will result in "hello10".
