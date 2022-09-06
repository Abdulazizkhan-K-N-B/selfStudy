package com.aknb.tasks.bySubject.math;

import java.util.Scanner;

public class MathEx {
    private static final Scanner in = new Scanner(System.in);

    public static void mathRun() {

//        math1();

//        math2();

    }

    private static void math1() {
        // math1)
        // x, y haqiqiy sonlari berilgan. Ularning kichigini sonlar yig'indisining yarmiga,
        // kattasini kopaytmasining ikkilanganiga almashtiruvchi dastur tuzilsin.
        // agar sonlar teng bo'lsa o'zgartirishsiz qoldirilsin.
        int x, y;
        System.out.print("You should enter x & y!\nx= ");
        x = in.nextInt();
        System.out.print("y= ");
        y = in.nextInt();

        if (x < y) {
            int temp1 = (x + y) / 2;
            y = (x * y) * 2;
            x = temp1;
        } else if (x > y) {
            int temp1 = (x + y) / 2;
            x = (x * y) * 2;
            y = temp1;
        }
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }

    private static void math2() {
        // math2)
        // N sonini M soniga bo'lgandagi
        // qoldiqni va butun qismini bo'lish amallarini( /, %)
        // ishlatmasdan topuvchi dastur tuzilsin.

        int n, m;
        System.out.print("Enter the N: ");
        n = in.nextInt();
        System.out.print("Enter the M: ");
        m = in.nextInt();

        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int whole = 0, remainder = 0;

        while (max > 0) {
            if (max - min > 0) {
                max -= min;
                whole++;
            } else if (max - min == 0) {
                whole++;
                max = 0;
            } else {
                remainder = max;
                max = 0;
            }
        }
        System.out.printf("%d %d", remainder, whole);
    }

}
