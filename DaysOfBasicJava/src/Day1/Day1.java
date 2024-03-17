package Day1;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // This is a single line comment
        /* This is a multi line comment */
    }
}

//Learn the difference between Java and Python
/*Java:

- Compiled language: Java code is compiled into bytecode which is executed on the Java Virtual Machine (JVM).
- Static typing: Requires explicit declaration of variable types.
- Syntax: More verbose compared to Python.
- Object-oriented: Emphasizes the use of classes and objects for structuring code.
- Memory management: Relies on garbage collection for memory management.
- Platform independence: Code written in Java can run on any platform with a JVM.
- Popular for enterprise applications and Android app development.

Python:

- Interpreted language: Python code is executed line by line by the Python interpreter.
- Dynamic typing: Variable types are inferred at runtime, no need for explicit declarations.
- Syntax: Concise and easy to read, with significant indentation (whitespace) to denote code blocks.
- Multi-paradigm: Supports procedural, object-oriented, and functional programming paradigms.
- Memory management: Utilizes automatic memory management via garbage collection.
- Platform independence: Code written in Python can run on any platform with a Python interpreter.
- Widely used in web development, data science, artificial intelligence, and automation.

Key Differences:

- Execution: Java is compiled, while Python is interpreted.
- Typing: Java is statically typed, Python is dynamically typed.
- Syntax: Java syntax is more verbose, while Python emphasizes readability with concise syntax.
- Memory Management: Both languages utilize garbage collection, but the mechanism and implementation may differ.
- Primary Use Cases: Java is popular in enterprise software and Android development, while Python is widely used in web development, data science, and automation.*/


//=> What is a Java compiler and how does it work?

/* 
A Java compiler is a software tool that translates Java source code (written by programmers) into bytecode, which is a set of instructions understood by the Java Virtual Machine (JVM). Here's how it works:

-Source Code: The programmer writes Java code using a text editor or an Integrated Development Environment (IDE).
-Compilation: When the programmer finishes writing the code, they invoke the Java compiler (usually by running a command or using an IDE feature). The compiler reads the source code files and performs a series of tasks:
-Syntax Checking: It verifies that the code adheres to the rules and syntax of the Java language. Any syntax errors are reported to the programmer.
-Semantic Analysis: It examines the code to ensure that the usage of variables, methods, classes, and other language constructs is correct according to the language's rules. For example, it checks for type compatibility and method signatures.
-Code Optimization: Some compilers perform optimization techniques to improve the efficiency of the bytecode generated. This may include removing redundant code or simplifying expressions.
-Bytecode Generation: After analyzing and validating the code, the compiler translates the Java source code into bytecode instructions. These instructions are stored in files with a ".class" extension.
-Output: If the compilation process is successful (i.e., no errors are found), the compiler generates one or more bytecode files corresponding to the Java source files. These bytecode files contain instructions that can be executed by the JVM.
-Execution: The bytecode files can now be executed by the Java Virtual Machine (JVM). The JVM reads the bytecode instructions and executes them, performing the operations specified in the original Java source code.*/

//=>Difference between Compiler and Interpreter

/* Compiler:

-Processing: A compiler translates the entire source code program into machine code or intermediate code (like bytecode in Java) in one go.
-Output: After compilation, the compiler generates executable files (machine code) or intermediate files (like bytecode) which can be executed later.
-Execution: The compiled code runs independently of the compiler. It can be executed repeatedly without needing the original source code or the compiler.
-Performance: Since compilation is done beforehand, compiled code tends to run faster as the translation process optimizes the code for the target machine.

Example: Languages like C, C++, and Java typically use compilers to convert source code into executable or bytecode files.

Interpreter:

-Processing: An interpreter reads the source code line-by-line and executes it immediately without converting it into machine code beforehand.
-Output: There is no separate output generated during interpretation. The execution happens directly as the interpreter processes each line of code.
-Execution: The execution occurs simultaneously with interpretation. Changes made to the source code will immediately reflect in the execution.
-Performance: Interpreted languages often have slower execution compared to compiled languages because of the overhead of interpreting code line-by-line.

Example: Languages like Python, JavaScript, and Ruby typically use interpreters to execute code.

Comparison:

-Speed: Compiled languages often execute faster as they convert code to machine language beforehand, while interpreted languages may have a slight delay in execution since they translate code on-the-fly.
-Portability: Interpreted languages are often more portable as the interpreter itself can be ported to different platforms, whereas compiled languages may need to be recompiled for each platform.
-Debugging: Interpreted languages often offer better debugging capabilities as they can provide detailed error messages and support dynamic code evaluation during runtime.
-Memory Usage: Interpreted languages may use more memory as the interpreter needs to be loaded into memory alongside the code being executed. Compiled languages, once compiled, may have smaller memory footprints.*/
