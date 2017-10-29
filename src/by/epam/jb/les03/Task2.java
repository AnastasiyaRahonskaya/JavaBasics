package by.epam.jb.les03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x, y, sum, mul;
        Scanner conin = new Scanner(System.in);

        System.out.println("Введите x: ");
        enterNumber(conin);
        x = conin.nextInt();

        System.out.println("Введите y: ");
        enterNumber(conin);
        y = conin.nextInt();

        sum = calculateSum(x, y);
        mul = calculateMul(x ,y);
        System.out.println("sum = " + sum + "; mul = " + mul);
    }

    public static void enterNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
    }

    public static int calculateSum(int x, int y) {
        return (x + y);
    }

    public static int calculateMul(int x, int y) {
        return (x * y);
    }
}
