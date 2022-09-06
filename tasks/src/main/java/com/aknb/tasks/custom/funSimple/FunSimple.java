package com.aknb.tasks.custom.funSimple;

import java.util.Objects;
import java.util.Scanner;

public class FunSimple {

    private static final Scanner in = new Scanner(System.in);

    public static void funSimpleRun() {

        // funSimple1(); funSimple2(); funSimple3();

        funSimple4();
    }


    public static void funSimple1() {
        // funSimple)
        // isPrime(N) mantiqiy funksiyasini hosil qilinsin.
        // (N > 0). Agar N soni tub bo'lsa true, aks holda false
        // qiymat qaytarilsin. Shu funksiya orqali kiritilgan k ta
        // sondan nechtasi tub ekanini aniqlovchi dastur tuzilsin.
        // misol: size=9 | 1, 2, 3, 4, 5, 6, 7, 8, 9 | 4
        //        size=9 | 9, 8, 5, 1, 9, 4, 6, 2, 3 | 3
        //        size=10 | 6, 8, 5, 2, 1, 4, 9, 7, 11, 12 | 4

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 0;
        int input, primeNumbersCount = 0;

        for (int i = 1; i <= size; i++) {

            System.out.print("_ ");
            input = in.nextInt();

            if (isPrime(input)) {
                primeNumbersCount++;
            }
        }

        System.out.println(primeNumbersCount);
    }


    private static void funSimple2() {
        // funSimple2)
        // Butun qiymat qaytaruvchi DigitCount(K) funksiyasini hosil qiling.
        // (K > 0). Funksiya K ning raqamlari sonini qaytarsin.
        // misol: k=12345 | 5
        //        k=10120 | 5
        //        k=123000 | 6
        System.out.print("DigitCount: k= ");
        int input = in.nextInt();
        System.out.println(
                digitCounter(input)
        );
    }

    private static void funSimple3() {
        // funSimple3)
        // Butun qiymatni qaytaruvchi DigitN(K, N) funksiyasini hosil qiling.
        // (K > 0). Funksiya K sonining N - raqamini qaytarsin.
        // Agar K soni raqamlari N dan kichik bo'lsa, minus bir qaytarilsin.
        // misol: k=12345, n=7 | -1
        //        k=123987, n=4 | 9
        //        k=10120, n=5 | 0

        System.out.print("DigitN(K, N) k= ");
        int input = in.nextInt();
        System.out.print("n= ");
        int number = in.nextInt();

        System.out.println(
                digitN(input, number)
        );
    }

    private static void funSimple4() {
        // funSimple4)
        // isPalindrom(N) mantiqiy funksiyasini hosil qiling.
        // (N > 0). Agar N soni palindrom bo'lsa - true
        // aks holda false qiymat qaytarilsin. O'ngdan chapga va
        // chapdan o'ngga bir xil o'qiladigan sonlar palindrom
        // sonlar deyiladi. Shu funksiya orqali uchta sondan nechtasi
        // palindrome ekanini aniqlovchi programma tuzilsin. isPalindrom
        // funksiyasida digitCount va digitN funksiyalaridan foydalanish
        // mumkin. (oldingi ikkita masalaga qarang).
        // misol: 12321, 123, 456 | 1
        //        121, 23332, 1591 | 2
        //        101, 121, 131 | 3

        System.out.print("isPalindrom(N) n= ");
        int number = in.nextInt();

        for (int i = 0; i < 3; i++) {

        }

        System.out.println(isPalindrom(number));
    }

    private static boolean isPalindrom(int number) {

        int digitCount = digitCounter(number);

        int  c = 0;

        while (digitCount > c){
            c ++;
            if (!Objects.equals(digitN(number, c), digitN(number, digitCount))){
                return false;
            }
            digitCount --;
        }

        return true;
    }


    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n == 1) ? false : true;
    }

    private static int digitCounter(int input) {
        int u = 0;

        while (input > 0) {
            input /= 10;
            u++;
        }
        return u;
    }

    private static int digitN(int input, int number) {
        int targetNumber = -1;
        int digitCount = digitCounter(input);

        if (digitCount - number >= 0){
            number = (digitCount - number) + 1;
            while (number > 0){
                targetNumber = input % 10;
                input /= 10;
                number --;
            }
        }
        return targetNumber;
    }
}