public class MyFirstJavaProgram {

    /* This is my first java program.
     * This will pring 'Hello World' as the output.
     */

    public static void main(String []args) {
        System.out.println("Hello World");
    }
}

/*
Notes:
------
1. Name of the file and class name should match. Otherwise, it throws an error.
$ javac first_prog.java 
first_prog.java:1: error: class MyFirstJavaProgram is public, should be declared
in a file named MyFirstJavaProgram.java
public class MyFirstJavaProgram {
       ^
       1 error
2. Compile -  javac MyFirstJavaProgram.java
3. Execute - java MyFirstJavaProgram
4. Output - Hello World
*/
