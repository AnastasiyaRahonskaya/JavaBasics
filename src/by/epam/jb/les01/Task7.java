package by.epam.jb.les01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double a = 0.0, b = 0.0, c = 0.0;
        double res;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        System.out.print("Enter b: ");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }

        if (a > b) {
            System.out.print("Enter c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            }
            res = b + c;
            System.out.println("b + c = " + res);
        } else if (a == b) {
            System.out.println("End");
        } else if (a < b) {
            System.out.print("Enter c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            }
            res = a + b + c;
            System.out.println("a + b + c = " + res);
            System.out.println("Happy New Year!");
        }
    }
}