package org.example;

public class Arrays {

    public static void main(String[] args) {

        System.out.println("Single Diamensional");
        int[] ar = new int[5];
        ar[0] = 10;
        ar[1] = 5;
        ar[2] = 15;
        ar[3] = 20;
        ar[4] = 25;

        int sum = 0;

        System.out.println("Size of the array: " + ar.length);
        System.out.println(ar[0]);
        System.out.println(ar[1]);

        for(int num: ar)
            sum = sum+num;

        System.out.println("Sum of items in array: "+ sum);

        for(int i =0;i<ar.length;i++)
            System.out.println(ar[i]);

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        double[] prices = new double[] {9.99, 19.99, 29.99};
        for (double price : prices) {
            System.out.println("Price: " + price);
        }

        System.out.println("-----------------------------------");
        System.out.println("Multidiamensional Diamensional");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names_multi = new String[2][2];
        names_multi[0][0] = "John";
        names_multi[0][1] = "Doe";
        names_multi[1][0] = "Jane";
        names_multi[1][1] = "Smith";

        for (int i = 0; i < names_multi.length; i++) {
            for (int j = 0; j < names_multi[i].length; j++) {
                System.out.println("Name[" + i + "][" + j + "]: " + names_multi[i][j]);
            }
        }




    }
}
