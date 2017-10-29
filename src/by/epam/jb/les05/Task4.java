package by.epam.jb.les05;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double[] newArr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        double[] arr = new double[enterANumber(scanner)];
        System.out.println("Enter array elements");
        enterArrayElements(scanner, arr);
        newArr = getZeroIndexesArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("newArr[" + i + "] = " + newArr[i]);
        }
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

    public static double[] getZeroIndexesArr(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no even elements in array");
        }
        double[] zeroIndexesArr = new double[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                zeroIndexesArr[count] = arr[i];
                count++;
            }
        }
        return zeroIndexesArr;
    }
}
