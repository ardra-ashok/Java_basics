package org.example;

public class loops {
    public static void main(String[] args) {

        // Ternary Operator Example
        int a = 15, b = 25;
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator - Max value: " + max);

        System.out.println("\n--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Count: " + i);
        }

        System.out.println("\n--- While Loop ---");
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Count: " + j);
            j++;
        }

        System.out.println("\n--- Do-While Loop ---");
        int k = 1;
        do {
            System.out.println("Do-While Loop Count: " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n--- Enhanced For (For-Each) Loop ---");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Array value: " + num);
        }

        System.out.println("--- Break Example ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n--- Continue Example ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd i = " + i);
        }
        int result = add(5, 10);
        System.out.println("Result: " + result);
    }

    static int add(int a, int b) {
        System.out.println("\n--- Return Example ---");
        return a + b;
    }

}
