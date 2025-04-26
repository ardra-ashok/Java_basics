package org.example;

public class Operators {
    public static void main(String[] args) {
        System.out.println("**** Types of Operators ****");

        /*
        * 1.Arithmetic Operators: +, -, *, /, % – for basic math operations.
        * 2.Relational Operators: ==, !=, >, <, >=, <= – for comparing values.
        * 3.Logical Operators: &&, ||, ! – for combining or negating boolean expressions.
        * 4.Unary Operators: +, -, ++, --, ! – operate on a single operand.
        * 5.Assignment Operators: =, +=, -=, *=, /=, %= – for assigning and updating values.
        * 6.Ternary Operator: ?: – a shortcut for if-else conditions.
        * 7.Type Comparison Operator: instanceof – checks object type at runtime.
        * */

        /* Arithmetic Operators */
        int a = 200, b = 100;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        /* Relational Operators   */
        System.out.println("-----------------");
        System.out.println("a==b="+(a==b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a>b="+(a>b));
        System.out.println("a<b="+(a<b));
        System.out.println("a>=b="+(a>=b));
        System.out.println("a<=b="+(a<=b));



    }
}
