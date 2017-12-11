package by.epam.jb.les06.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter students quantity: ");
        Student[] students = new Student[enterNumber(scanner)];
        for (int i = 0; i < students.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            students[i] = new Student();
            System.out.print("Enter student's name: ");
            students[i].setName(enterName(scanner1));
            students[i].setGroupNumber(groupNumberRandom());
            System.out.print("Student's group: " + students[i].getGroupNumber());
            System.out.println();
        }
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].getGroupNumber());
//        }
    }

    public static int enterNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    public static String enterName(Scanner scanner) {
        return scanner.nextLine();
    }

    public static int groupNumberRandom() {
        return (int) Math.random() * 2 + 1;
    }
}
