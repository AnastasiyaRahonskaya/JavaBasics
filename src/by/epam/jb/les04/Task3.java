package by.epam.jb.les04;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String monthString;
        Month month;
        Season season;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        monthString = enterMonth(scanner).toUpperCase();
        month = Month.valueOf(monthString);
        season = getSeason(month);
        System.out.println("Season: " + season);
    }

    public static String enterMonth(Scanner scanner) {
        return scanner.next();
    }

    public static Season getSeason(Month month) {
        Season season = Season.WINTER;
        switch (month) {
            case TWELVE:
            case ONE:
            case TWO:
                season = Season.WINTER;
                break;
            case THREE:
            case FOUR:
            case FIVE:
                season = Season.SPRING;
                break;
            case SIX:
            case SEVEN:
            case EIGHT:
                season = Season.SUMMER;
            case NINE:
            case TEN:
            case ELEVEN:
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("This month is not exist!");
                break;
        }
        return season;
    }

}

