package by.epam.jb.les04;

import java.util.Scanner;

public class Task4 {
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
        if (month == Month.TWELVE || month == Month.ONE || month == Month.TWO) {
            season = Season.WINTER;
        } else if (month == Month.THREE || month == Month.FOUR || month == Month.FIVE) {
            season = Season.SPRING;
        } else if (month == Month.SIX || month == Month.SEVEN || month == Month.EIGHT) {
            season = Season.SUMMER;
        } else if (month == Month.NINE || month == Month.TEN || month == Month.ELEVEN) {
            season = Season.AUTUMN;
        }
        return season;
    }
}
