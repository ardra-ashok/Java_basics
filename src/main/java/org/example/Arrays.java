package org.example;

public class Arrays {

    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 10;
        ar[1] = 5;
        ar[2] = 15;
        ar[3] = 20;
        ar[4] = 25;

        int sum = 0;

        System.out.println("Size of the array: " + ar.length);

        for(int num: ar)
            sum = sum+num;

        System.out.println("Sum of items in array: "+ sum);
    }
}
