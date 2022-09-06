package com.aknb.tasks.bySubject.conditions;

import java.util.Scanner;

public class SwitchCase {
    private static final Scanner in = new Scanner(System.in);

    public static void switchRun() {

//        switch1();

    }

    private static void switch1() {
        // switch2)
        // Ikkita butun son berilgan Day (kun) va Month (oy).
        // (Kabisa bo'lmagan yil sanasi kiritiladi).
        // Berilgan sondan keyingi sanani ifodalovchi dastur tuzilsin.

        Integer day, month;

        System.out.print("Enter the day: ");
        day = in.nextInt();
        System.out.print("Enter the month: ");
        month = in.nextInt();

        int dayOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                dayOfMonth = 31;
                break;
            }
            case 2: {
                dayOfMonth = 28;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                dayOfMonth = 30;
                break;
            }
            default:
                System.out.println("Bunday oy yo'q!");
        }
        if (day <= dayOfMonth) {
            if (day < dayOfMonth) {
                day++;
            } else {
                month += 1;
                day = 1;
            }
            System.out.printf("%02d.%02d\n", day, month);
        } else {
            System.out.println("Bunday sana yo'q!");
        }
    }
}
