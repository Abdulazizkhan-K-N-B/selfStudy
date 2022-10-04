package com.aknb.tasks.custom.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatClass {

    public static void numberFormatFirstEx() {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        in.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String uzb = NumberFormat.getCurrencyInstance(new Locale("en", "uzb")).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("UZB: " + uzb);
    }
}
