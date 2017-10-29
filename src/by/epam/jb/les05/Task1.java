package by.epam.jb.les05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int k;
        double sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        double[] arr = new double[enterANumber(scanner)];
        System.out.println("Enter array elements");
        enterArrayElements(scanner, arr);
        System.out.print("Enter a number: ");
        k = enterANumber(scanner);
        sum = sum(arr, k);
        System.out.println("sum: " + sum);
    }

    public static int enterANumber(Scanner scanner) {
        return scanner.nextInt();
    }

    public static void enterArrayElements(Scanner scanner, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }
    }

    public static double sum(double[] arr, int k) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%k == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
