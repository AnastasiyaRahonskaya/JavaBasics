package by.epam.jb.les02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double x = 0, f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        if (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
        }
        if (x <= 3) {
            f = 9;
        } else {
            f = 1 / (x * x + 1);
        }

        System.out.println("F(x)=" + f);
    }
}