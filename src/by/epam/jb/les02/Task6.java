package by.epam.jb.les02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, d = 0, res1, res2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        System.out.print("Enter b: ");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }
        System.out.print("Enter c: ");
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();
        }
        System.out.print("Enter d: ");
        if (scanner.hasNextDouble()) {
            d = scanner.nextDouble();
        }
        res1 = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
        res2 = a / c * b / d - (a * b - c) / c * d;
        System.out.println("res1: " + res1 + "\nres2: " + res2);
    }
}