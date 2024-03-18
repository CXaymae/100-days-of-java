package Day2;

public class Day2 {
	public static void main(String[] args) {
        int entier = 20;
        double decimale = 13000.5;
        String chaine = "CXaymae";
        
        System.out.println("This is an integer" + entier);
        System.out.println("This is a double" + decimale);
        System.out.println("This is a string" + chaine);
    }

}

/*  Sure, I'd be happy to explain those concepts:

1. Initialization, Declaration, and Assignment of Variables:
- **Declaration**: This is when you define the type and name of a variable without necessarily assigning it a value. For example, in many programming languages, you might declare a variable like this: `int x;` This tells the program that there is a variable named `x` which can hold integer values, but it doesn't assign any specific value to `x` yet.
  
- **Initialization**: This is when you assign an initial value to a variable at the time of declaration or later on in the program. For example, `int x = 5;` declares a variable `x` of type integer and initializes it with the value `5`. Initialization is essentially combining declaration and assignment in one step.

- **Assignment**: This is when you give a value to a variable that has already been declared. For example, if `x` has already been declared, you can assign it a value later in the program like this: `x = 10;`

2. Primitive vs Non-Primitive Data Types:
- **Primitive Data Types**: These are basic data types provided by the programming language itself. They are predefined and usually directly supported by hardware. Examples include integers, floating-point numbers, characters, and boolean values. They are called "primitive" because they are not composed of other data types.

- **Non-Primitive Data Types**: Also known as reference types or composite types, these are created by the programmer and are not predefined in the language itself. They are composed of primitive data types and/or other composite types. Examples include arrays, strings, objects, and classes.

3. Default Values and Sizes of Primitive Data Types:

- **Integer Types**: `int`, `short`, `long`, `byte` - Default value is typically 0. Sizes can vary based on the programming language and the system architecture, but common sizes are:
  - `byte`: 8 bits
  - `short`: 16 bits
  - `int`: 32 bits
  - `long`: 64 bits

- **Floating-Point Types**: `float`, `double` - Default value is 0.0. Sizes can vary, but commonly:
  - `float`: 32 bits
  - `double`: 64 bits

- **Character Type**: `char` - Default value is '\0' (null character). Size is usually 16 bits.

- **Boolean Type**: `boolean` - Default value is `false`. Size is not strictly defined, but it's often implementation-dependent.

These default values and sizes may vary slightly depending on the programming language and the platform you're using. Always refer to the documentation specific to your environment for precise details.*/