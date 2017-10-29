package by.epam.jb.les05;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] newArr;
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

    public static int[] getZeroIndexesArr(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        int[] zeroIndexesArr = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndexesArr[count] = i;
                count++;
            }
        }
        return zeroIndexesArr;
    }
}
