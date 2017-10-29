package by.epam.jb.les02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        double sum, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }

        if (a == b) {
            System.out.println("New Year is soon!");
        } else {
            System.out.println("Enter a number");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            }
            sum = a + b + c;
            p = a * a + b * b;
            System.out.println("sum = " + sum + "\np = " + p + "\nMy favourite football team is ...");
        }
    }
}