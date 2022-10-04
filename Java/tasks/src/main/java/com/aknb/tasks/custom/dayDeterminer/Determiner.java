package com.aknb.tasks.custom.dayDeterminer;

import java.util.HashMap;
import java.util.Scanner;

public class Determiner {

    private static final Scanner in = new Scanner(System.in);

    public static void determiner() {
        // math2)
        // Ikkita butun son berilgan Day (kun) va Month (oy).
        // (Kabisa bo'lmagan yil sanasi kiritiladi).
        // Berilgan sondan keyingi sanani ifodalovchi dastur tuzilsin.

        int day, month;

        System.out.print("Enter the day: ");
        day = in.nextInt();
        System.out.print("Enter the month: ");
        month = in.nextInt();

        while (!(day == 0 && month == 0)) {
            HashMap<Integer, Integer> calendarMap = new HashMap<>();
            addToMap(calendarMap);

            if (calendarMap.get(month) != null) {
                int dayInMonth = calendarMap.get(month);

                if (day <= dayInMonth) {

                    if (day < dayInMonth) {
                        day++;
                    } else {
                        month = (month == 12) ? 1 : month + 1;
                        day = 1;
                    }
                    System.out.printf("%02d.%02d\n", day, month);
                } else {
                    System.out.println("Bunday sana yo'q!");
                }
            } else {
                System.out.println("Bunday oy yo'q!");
            }
            System.out.print("Enter the day: ");
            day = in.nextInt();
            System.out.print("Enter the month: ");
            month = in.nextInt();
        }
    }

    private static void addToMap(HashMap<Integer, Integer> calendarMap) {
        calendarMap.put(1, 31);
        calendarMap.put(2, 28);
        calendarMap.put(3, 31);
        calendarMap.put(4, 30);
        calendarMap.put(5, 31);
        calendarMap.put(6, 30);
        calendarMap.put(7, 31);
        calendarMap.put(8, 31);
        calendarMap.put(9, 30);
        calendarMap.put(10, 31);
        calendarMap.put(11, 30);
        calendarMap.put(12, 31);
    }
}
