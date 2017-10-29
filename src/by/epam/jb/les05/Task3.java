package by.epam.jb.les05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        boolean isIncreasing;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        double[] arr = new double[enterANumber(scanner)];
        System.out.println("Enter array elements");
        enterArrayElements(scanner, arr);
        isIncreasing = isIncreasing(arr);
        System.out.println(isIncreasing);
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

    public static boolean isIncreasing(double[] arr) {
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length - 1 && isIncreasing; i++) {
            if (arr[i] < arr[i + 1]) {
                isIncreasing = true;
            } else {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }
}
