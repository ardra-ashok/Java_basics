package org.example;

public class Strings {

    public static void main(String[] args) {
        String s = new String("Welcome");
        System.out.println(s);

        /* String methods */

        System.out.println(s.length());

        String s1 = "hello to";
        String s2 = "world ";
        String s3 = "Welcome";
        String s4 = "welcome";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).trim());
        System.out.println(s1.charAt(2));
        System.out.println(s.contains("el"));
        System.out.println("------");
        System.out.println("Equal and Equalsignorecase");
        System.out.println(s.equals(s3));
        System.out.println(s1.equals("hello to"));
        System.out.println(s.equalsIgnoreCase(s4));

        System.out.println("Substring");
        System.out.println(s.substring(2,5));
        System.out.println(s.substring(1,3));

        System.out.println(s.replace('e','o'));

        String email = "abc@gmail.com";

        String a[] = email.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);





    }
}
