package by.epam.jb.les04;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        double max, min;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements");
        enterArrayElements(scanner, arr);
        max = findMax(arr);
        System.out.println("\nmax value: " + max);
        min = findMin(arr);
        index = findIndexOfMin(arr);
        System.out.println("min value: " + min + "\nindex of min: " + index + "\n");
        sort(arr);
    }

    public static void enterArrayElements(Scanner scanner, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }
    }

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findIndexOfMin(double[] arr) {
        double min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double min = arr[i];
            int imin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    imin = j;
                }
            }
            if (i != imin) {
                double temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
            }
            System.out.println("newArr[" + i + "] = " + arr[i]);
        }
    }
}
