package by.epam.jb.les04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String month;
        int year;
        int numDays;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        month = enterMonth(sc);
        System.out.print("Введите год: ");
        year = enterYear(sc);

        numDays = daysQuantity(month, year);

        System.out.println("Число дней = " + numDays);
    }

    public static String enterMonth(Scanner scanner) {
        return scanner.next();
    }

    public static int enterYear(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int daysQuantity(String s, int x) {
        int numDays = 0;
        switch (s) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numDays = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numDays = 30;
                break;
            case "February":
                if (((x % 4 == 0) && !(x % 100 == 0)) || (x % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                    break;
            default:
                System.out.println("Несуществующий месяц");
                break;
        }
        return numDays;
    }
}
