package by.epam.jb.les02;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double a = 0, b = 0, h = 0, f = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        System.out.print("Enter b: ");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }
        System.out.print("Enter h: ");
        if (scanner.hasNextDouble()) {
            h = scanner.nextDouble();
        }
        double newA = a;
        System.out.println("x               F(x)");
        while (belongsToTheSegment(newA, b)) {
            System.out.println(newA + "             " + calculateValueOfTheFunction(newA));
            newA = a += h;
        }
    }

    public static boolean belongsToTheSegment(double a, double b) {
        if (a <= b) {
            return true;
        } else {
            System.out.println("Argument is out bounds!");
            return false;
        }
    }

    public static double calculateValueOfTheFunction(double a) {
        return (2 + Math.tan(a / 2) + 1);
    }
}