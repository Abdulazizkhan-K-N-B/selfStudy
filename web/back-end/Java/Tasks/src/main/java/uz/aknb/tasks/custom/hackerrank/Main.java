package uz.aknb.tasks.custom.hackerrank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.print("* byte");
                if (x >= -32_768 && x <= 32_767) System.out.print("* short");
                if (x >= -2_147_483_648 && x <= 2_147_483_647) System.out.print("* int");
                if (x >= -9_223_372_036_854_775_808L && x <= 9_223_372_036_854_775_807L) System.out.print("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}