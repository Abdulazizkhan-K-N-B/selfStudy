package com.aknb.tasks.custom.multiSum;

import java.util.Scanner;

public class MultiSum {

    /*
     * Hackerrank examine exercise multi sum
     */

    public static void multiSum() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter: ");
        String[] input = in.nextLine().split(" ");


        while (!input[0].equals("0")) {


            try {
                int sum = 0;
                for (String s : input) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (Exception e) {

                StringBuilder concat = new StringBuilder("");
                for (String s : input) {
                    concat.append(s);
                }
                System.out.println(concat);
            }
            System.out.print("Enter: ");
            input = in.nextLine().split(" ");
        }
    }

    public static void multiSumV2() {
        Scanner in = new Scanner(System.in);

        System.out.print("EnterV2: ");
        String[] input = in.nextLine().split(" ");

        while (!(input[0].equals("0") && input.length == 1)) {
            if (isInt(input)) {
                System.out.println(sum(input));
            } else {
                System.out.println(concat(input));
            }
            System.out.print("EnterV2: ");
            input = in.nextLine().split(" ");
        }
        in.close();
    }

    private static int sum(String[] input) {
        int sum = 0;

        for (String s : input) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private static String concat(String[] input) {
        StringBuilder concat = new StringBuilder("");

        for (String s : input) {
            concat.append(s);
        }
        return concat.toString();
    }


    public static boolean isInt(String[] input) {
        for (String s : input) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
