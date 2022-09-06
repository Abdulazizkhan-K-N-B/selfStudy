package com.aknb.tasks.bySubject.conditions;

import java.util.Scanner;

public class IfElse {
    private static final Scanner in = new Scanner(System.in);

    public static void ifRun() {

//        if1();

//        if2();

    }

    public static void if1() {
        // if1) Uchta son berilgan. Shu sonlarning kichigini aniqlovchi programma tuzilsin.

        int first, second, third;
        System.out.print("First: ");
        first = in.nextInt();
        System.out.print("Second: ");
        second = in.nextInt();
        System.out.print("Third: ");
        third = in.nextInt();

        if (first <= second && second <= third) {
            System.out.println(first);
        } else if (first >= second && second >= third) {
            System.out.println(third);
        } else if (second <= first && first <= third) {
            System.out.println(second);
        } else if (third <= first && first <= second) {
            System.out.println(third);
        }
    }

    public static void if2() {
        // if2)
        // Yil berilgan (musbat butun son).
        // Berilgan yilda nechta kun borligini aniqlovchi programma tuzilsin.
        // Kabisi yili deb 4 ga karrali yillarga aytiladi.
        // Lekin 100 ga karrali yillar ichida faqat 400 ga karralilari kabisa yili hisoblanadi.
        // Masalan 300, 1300 va 1900 kabisa yili emas. 1200 va 2000 kabisa yili.
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " : 366");
                } else {
                    System.out.println(year + " : 365");
                }
            } else {
                System.out.println(year + " : 366");
            }
        } else {
            System.out.println(year + " : 365");
        }
    }
}