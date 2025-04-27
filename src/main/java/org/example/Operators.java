package org.example;

public class Operators {
    public static void main(String[] args) {
        System.out.println("**** Types of Operators ****");

        /*
        * 1.Arithmetic Operators: +, -, *, /, % – for basic math operations.
        * 2.Relational Operators: ==, !=, >, <, >=, <= – for comparing values.
        * 3.Logical Operators: &&, ||, ! – for combining or negating boolean expressions.
        * 4.Unary Operators: +, -, ++, --, !, ~ – operate on a single operand.
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

        /* Logical operators */
        System.out.println("----------------------------");
        System.out.println("**** Logical operators ****");

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x );
        System.out.println(!y );

        System.out.println(10>20);
        System.out.println(20>40);

        /* Unary Operators  */
        System.out.println("------------------------------");
        System.out.println("**** Unary Operators ****");

        a++;
        System.out.println(a);
        System.out.println(++a);
        a--;
        System.out.println(a);
        System.out.println(--a);
        boolean flag = true;
        System.out.println(!flag);

        int c = 4;
        System.out.println(~c);

        System.out.println("-------------------");
        System.out.println("Assignment Operator");

        int a = 10;
        System.out.println("Initial value of a: " + a);

        a += 5;
        System.out.println("After a += 5: " + a);  // 15

        a -= 3;
        System.out.println("After a -= 3: " + a);  // 12

        a *= 2;
        System.out.println("After a *= 2: " + a);  // 24

        a /= 4;
        System.out.println("After a /= 4: " + a);  // 6

        a %= 5;
        System.out.println("After a %= 5: " + a);  // 1





    }
}
