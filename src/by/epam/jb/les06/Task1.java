package by.epam.jb.les06;

import java.util.Scanner;

/**
 * Created by Anastasiya_Rahonskay on 10/27/2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int den;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        Rational[] arr = new Rational[enterNumber(scanner)];

        for (int i = 0; i < arr.length; i++) {
            Rational rational = new Rational();
            System.out.print("Enter a numerator for " + (i + 1) + " fraction: ");
            rational.setNum(enterNumber(scanner));
            System.out.print("Enter a denominator for " + (i + 1) + " fraction: ");
            den = enterNumber(scanner);
            if (rational.isValidDen(den)) {
                rational.setDen(den);
            } else {
                System.out.println("Invalid data.");
            }
            arr[i] = rational;
        }
        for (Rational fraction : arr) {
            System.out.println(fraction.getNum() + "/" + fraction.getDen());
        }
    }

    public static int enterNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}