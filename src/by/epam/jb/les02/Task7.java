package by.epam.jb.les02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, kv = 0, f = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            }
            if (a >=0) {
                kv = a*a;
                System.out.println("kv: " + kv);
            } else {
                f = Math.pow(a, 4);
                System.out.println("f: " + f);
            }
        }
    }
}