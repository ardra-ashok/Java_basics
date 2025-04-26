package org.example;

public class Datatypes {
    public static void main(String[] args) {
//       Variables and DataTypes

        int a = 200;
        System.out.println("the value of a is: "+a);

//        Datatypes In java
//        Primitive and non- primitive datatypes
        /* Primitive datatypes
        * byte, short, int , long - number without decimal
        * float, double - decimal number
        * char - single character
        *  boolean - true/false
         */
        /* Non-primitive
        * String
        * Arraylist
        * HashMap
        * HashSet etc...
        * */

        /* Numeric datatypes */
        byte by = 120;
        System.out.println(by);
        short sh = 290;
        System.out.println(sh);
        int in = 500;
        System.out.println(in);
        long ln = 1000000000L; // literal is needed at the end of the value.
        System.out.println(ln);

        /* Decimal datatypes  - double and float  */
        System.out.println("**** Decimal datatypes  - double and float ****");
        float fl = 150.78f; // literal is needed at the end of the value.
        System.out.println(fl);
        double dl = 123.67895477;
        System.out.println(dl);

        /* character datatypes */
        System.out.println("**** Character datatype ****");
        char grad = 'A';
        System.out.println(grad);

        // Boolean
        boolean bl = true;
        System.out.println(bl);

//        String
        String str = "abcd";
        System.out.println(str);




    }
}