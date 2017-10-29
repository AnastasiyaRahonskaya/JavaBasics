package by.epam.jb.les02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n = 0, q = 0;
        double x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers quantity: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        System.out.println("Enter real numbers:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            }
            if (!(x % 1 == 0)) {
                if ((x % 2 == 0) & (x > 15)) {
                    q++;
                }
            }
        }
        System.out.println("Quantity: " + q);
    }
}
