package by.epam.jb.les02;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double r = 0.0;
        double p, s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        if (scanner.hasNextDouble()) {
            r = scanner.nextDouble();
        }
        p = calculateCircleCircumference(r);
        s = calculateCircleArea(r);
        System.out.println("Circle circumference = " + p + "\nCircle area = " + s);
    }

    public static double calculateCircleCircumference(double r) {
        return (2 * Math.PI * r);
    }

    public static double calculateCircleArea(double r) {
        return (Math.PI*r*r);
    }
}
