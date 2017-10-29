package by.epam.jb.les01;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        double result;
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
        result = a * a - Math.pow(b - c, 2) + Math.log(b * b + 1);
        System.out.println("result: " + result);
    }
}