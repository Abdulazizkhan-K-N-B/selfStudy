package com.aknb.tasks.bySubject.loop;

import java.util.Scanner;

public class WhileLoop {
    private static final Scanner in = new Scanner(System.in);

    public static void whileRun() {

//        while1();

//        while2();
    }

    // Ikkita qo'shni son yig'indisining eng katta qiymatini aniqlovchi dastur tuzilsin

    private static void while1() {

        // while1)
        // Bankka boshlang'ich summa  sumda qo'yildi.
        // Har oyda bor bo'lgan summa p foizga oshadi
        // (0 < p < 12). Necha oydan keyin boshlang'ich
        // qiymat 2 martadan ko'p bo'lishini hisoblovchi
        // dastur tuzilsin. Necha oy k - butun son.
        // Bankda hosil bo'lgan summa haqiqiy son ekranga chiqarilsin.
        // (1000, 5 | 1000, 7 | 1000, 12)

        System.out.print("Money: ");
        double money = in.nextInt();
        System.out.print("Percent: ");
        int percent = in.nextInt();

        double temp = money;

        int u = 0;
        while (!((money / 2) > temp)) {
            money += (money / 100) * percent;
            u++;
        }
        System.out.printf("%d oyda %.02f", u, money);
    }

    private static void while2() {

        // while2)
        // n butun soni berilgan (n > 0).
        // Bo'lib butun va qoldiq qismlarini
        // aniqlash orqali berilgan son raqamlari
        // sonini va raqamlari yig'indisini chiqaruvchi dastur tuzilsin.

        System.out.print("Enter the N: ");
        int n = in.nextInt(), u = 0, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
            u++;
        }
        System.out.printf("%d %d", u, sum);
    }


    private static void print_() {
        System.out.print("_ ");
    }
}