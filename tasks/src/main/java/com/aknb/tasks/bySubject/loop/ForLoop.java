package com.aknb.tasks.bySubject.loop;

import java.util.Scanner;

public class ForLoop {
    private static final Scanner in = new Scanner(System.in);

    public static void forRun() {

//        for1();

//        for2();

//        for3();

//        for4();

    }

    private static void for1() {
        // for1)
        // N natural soni berilgan. Shu songacha bo'lgan
        // mukammal sonlarni chiqaruvchi dastur tuzilsin.
        // O'zidan boshqa bo'luvchilari yig'indisi o'ziga
        // teng bo'lgan son mukammal son deyiladi.
        // (misol: 6->1+2+3=6, 28->1+2+4+7+14=28)

        System.out.print("Enter the N: ");
        int N = in.nextInt();

        int sum = 0;
        for (int i = 6; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;
        }
    }

    private static void for2() {
        // for2)
        // N natural soni berilgan. Shu songacha bo'lgan
        // tub sonlarni chiqaruvchi programma tuzilsin.

        System.out.print("Enter the N: ");
        int N = in.nextInt();

        for (int i = 2; i <= N; i++) {
            if (isTub(i)) {
                System.out.println(i);
            }
        }
    }

    private static void for3() {
        // for3)
        // N natural soni berilgan.
        // N gacha bo'lgan do'st sonlarni chiqaruvchi dastur tuzilsin.
        // Agar birinchi son bo'luvchilari yig'indisi ikkinchi songa,
        // ikkinchi son bo'luvchilari yig'indisi birinchi songa teng bo'lsa,
        // bu sonlar do'st sonlar deyiladi.
        // misol: 220=1+2+4+71+142(284 ni bo'luvchilari)
        //        284=1+2+4+5+10+11+20+22+44+55+110(220 ni bo'luvchilari)

        System.out.print("Enter the N: ");
        int N = in.nextInt();
        int sum = 0;
        int sumAll = 0;
        for (int i = 2; i <= N; i++) {

            for (int x = 1; x < i; x++) {
                if (i % x == 0) {
                    sum += x;
                }
            }
            if (sum > i) {

                for (int k = 1; k < sum; k++) {
                    if (sum % k == 0) {
                        sumAll += k;
                    }
                }
                if (i == sumAll) {
                    System.out.printf("%d %d\n", i, sum);
                }
            }
            sum = 0;
            sumAll = 0;
        }
    }

    private static void for4() {
        // for4)
        // A va B natural sonlari berilgan.
        // Evklid algoritmi bo'yicha EKUB(a, b) ni
        // aniqlovchi dastur tuzilsin.
        // EKUB(Eng Katta Umumiy Bo'luvchisi).

        int a, b;
        System.out.print("Enter the A: ");
        a = in.nextInt();
        System.out.print("Enter the B: ");
        b = in.nextInt();

        int EKUB = 0;

        for (int i = 1; i < Math.max(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                EKUB = i;
            }
        }
        System.out.println(EKUB);
    }


    private static boolean isTub(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}