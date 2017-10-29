package by.epam.jb.les02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n = 0, x = 0, even = 0, sum = 0, q = 0;
        System.out.print("Enter numbers quantity: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        System.out.println("Enter digit numbers");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            }
            if (x % 2 == 0) {
             even++;
            }
            if (x % 3 == 0) {
                sum = sum + x;
            }
            if (Math.abs(x) < 3) {
                q++;
            }
        }
        System.out.println("Even numbers quantity: " + even + "\nSum is a multiple of 3: " + sum + "\nNumbers whose modulus < 3 quantity: " + q);
    }
}