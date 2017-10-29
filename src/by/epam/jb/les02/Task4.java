package by.epam.jb.les02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = 0, x = 0, a = 0, sum = 0;
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
            if (x > 15 | x < 2) {
                a++;
            }
            if (x % 5 == 4) {
                sum = sum + x;
            }
        }
        System.out.println("sravn: " + a + "\nsum: " + sum);
    }
}