package by.epam.jb.les02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n = 0, x = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers quantity: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            }
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}