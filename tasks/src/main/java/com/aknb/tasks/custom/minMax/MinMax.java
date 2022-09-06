package com.aknb.tasks.custom.minMax;

import java.util.Scanner;

public class MinMax {

    private static final Scanner in = new Scanner(System.in);

    public static void minMaxRun() {
//        minMax1();

//        minMax2();

//        minMax3();

//        minMax4();

//        minMax5();

//        minMax6();

//        minMax7();

//        minMax8();

//        minMax9();

    }

    private static void minMax1() {
        // minMax1)
        // N natural son va n ta sonlar to'plami berilgan.
        // Kiritilgan to'plamdagi eng katta va eng kichik
        // sonni topuvchi dastur tuzilsin. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 6, 7, 8, 9 | 1, 9
        //        size=4 | 56, 10, 25, 36 | 10, 56

        System.out.print("Enter the size of the N: ");

        int size = in.nextInt(), temp;

        System.out.print("_ ");
        int min = in.nextInt();

        System.out.print("_ ");
        int max = in.nextInt();

        if (min > max) {
            max += min;
            min = max - min;
            max -= min;
        }

        for (int i = 2; i < size; i++) {

            System.out.print("_ ");

            temp = in.nextInt();
            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }
        }

        System.out.printf("%d %d", min, max);
    }

    private static void minMax2() {
        // minMax1)
        // N natural son va n ta sonlar to'plami berilgan.
        // Kiritilgan to'plamdagi eng kichik element va uning
        // o'rnini aniqlovchi dastur tuzilsin. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 6, 7, 8, 9 | 1, 1
        //        size=4 | 56, 10, 25, 36 | 10, 2

        System.out.print("Enter the size of N: ");
        int size = in.nextInt(), u = 1, temp;

        System.out.print("_ ");
        int min = in.nextInt(), index = u;

        for (int i = 1; i < size; i++) {
            u++;
            System.out.print("_ ");
            temp = in.nextInt();
            if (temp < min) {
                min = temp;
                index = u;
            }
        }

        System.out.printf("%d %d", min, index);

    }

    private static void minMax3() {
        // minMax3)
        // N natural soni va N ta butun sondan iborat to'plam berilgan.
        // Birinchi uchragan eng kichik va oxirgi uchragan eng katta
        // element va ularning tartib raqamini aniqlovchi dastur tuzilsin.
        // Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 1, 3, 2, 5 | 1 1;5 9
        //        size=9 | 9, 8, 5, 1, 9, 4, 6, 2, 1 | 1 4;9 5

        System.out.print("Enter the size of N: ");
        int size = in.nextInt(), u = 1;

        System.out.print("_ ");
        int first = in.nextInt(), firstIndex = u;
        u++;

        System.out.print("_ ");
        int second = in.nextInt(), secondIndex = u;
        int third;
        u++;


        while (u <= size) {
            System.out.print("_ ");
            third = in.nextInt();

            if (first < second) {
                if (second <= third) {
                    second = third;
                    secondIndex = u;
                } else {
                    u++;
                    continue;
                }
            } else {
                first = second;
                firstIndex = secondIndex;
                second = third;
                secondIndex = u;
            }
            u++;
        }

        System.out.printf("%d %d; %d %d", first, firstIndex, second, secondIndex);
    }

    private static void minMax4() {
        // minMax4)
        // N natural soni va N ta butun sondan iborat to'plam berilgan.
        // Birinchi uchragan ekstremal element va uning tartib raqamini
        // aniqlovchi dastur tuzilsin. Ekstremal element deb eng katta
        // yoki eng kichik elementga aytiladi. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 1, 3, 2, 5 | 1 1
        //        size=9 | 7, 8, 5, 1, 9, 4, 6, 2, 1 | 1 4
        //        size=10 | 7, 8, 5, 2, 9, 4, 6, 9, 1, 1 | 9 5

        System.out.print("Enter the size of N: ");
        int size = in.nextInt();
        int u = 1, temp, min, max, minIndex = 0, maxIndex = 0;

        System.out.print("_ ");
        min = in.nextInt();
        u++;

        System.out.print("_ ");
        max = in.nextInt();

        if (max < min) {
            temp = max;
            max = min;
            min = temp;
            minIndex = u;
            maxIndex = u - 1;
        } else {
            minIndex = u - 1;
            maxIndex = u;
        }


        u++;
        while (u <= size) {
            System.out.print("_ ");
            temp = in.nextInt();

            if (max < temp) {
                max = temp;
                maxIndex = u;
            } else if (min > temp) {
                min = temp;
                minIndex = u;
            }

            u++;
        }
        if (minIndex < maxIndex) {
            System.out.printf("%d %d", min, minIndex);
        } else {
            System.out.printf("%d %d", max, maxIndex);
        }
    }

    private static void minMax5() {
        // minMax4)
        // N natural soni va N ta butun sondan iborat to'plam berilgan.
        // Oxirgi uchragan ekstremal element va uning tartib raqamini
        // aniqlovchi dastur tuzilsin. Ekstremal element deb eng katta
        // yoki eng kichik elementga aytiladi. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 1, 3, 2, 5 | 5 9
        //        size=9 | 7, 8, 5, 1, 9, 4, 6, 2, 1 | 1 9
        //        size=10 | 7, 8, 5, 2, 9, 4, 6, 9, 1, 1 | 1 10

        System.out.print("Enter the size of N: ");
        int size = in.nextInt();
        int u = 1, temp;
        int min, max;
        int minIndex = 0, maxIndex = 0;

        System.out.print("_ ");
        min = in.nextInt();
        u++;

        System.out.print("_ ");
        max = in.nextInt();

        if (max < min) {
            temp = max;
            max = min;
            min = temp;
            minIndex = u;
            maxIndex = u - 1;
        } else {
            minIndex = u - 1;
            maxIndex = u;
        }

        u++;
        while (u <= size) {
            System.out.print("_ ");
            temp = in.nextInt();

            if (max <= temp) {
                max = temp;
                maxIndex = u;
            } else if (min >= temp) {
                min = temp;
                minIndex = u;
            }

            u++;
        }
        if (minIndex > maxIndex) {
            System.out.printf("%d %d", min, minIndex);
        } else {
            System.out.printf("%d %d", max, maxIndex);
        }
    }

    private static void minMax6() {
        // minMax6)
        // N natural soni va N ta butun sondan iborat
        // to'plam berilgan. Eng kichik musbat sonni aniqlovchi
        // dastur tuzilsin. Agar musbat son bo'lmasa nol chiqarilsin.
        // massivdan foydalanmang.
        // misol: size=9 | -1, 2, 3, 4, 5, 11, 3, 2, 5 | 2
        //        size=9 | -7, -8, -5, -1, -9, -4, -6, -2, -1 | 0
        //        size=10 | -7, -8, 5, 2, 9, 4, 6, 9, 1, 1 | 1

        System.out.print("Enter the size of N: ");
        int size = in.nextInt();

        System.out.print("_ ");
        int musbat = in.nextInt(), temp;

        for (int i = 2; i <= size; i++) {

            System.out.print("_ ");
            temp = in.nextInt();
            if (temp < musbat && temp > 0) {
                musbat = temp;
            } else if (musbat < 0) {
                musbat = temp;
            }
        }
        if (musbat > 0) {
            System.out.println(musbat);
        } else {
            System.out.println(0);
        }
    }

    private static void minMax7() {
        // minMax7)
        // N natural soni va N ta butun sondan iborat to'plam berilgan.
        // Birinchi uchragan egn katta toq son element va uning tartib
        // raqamini aniqlovchi dastur tuzilsin. Agar toq son bo'lmasa
        // nol chiqarilsin. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 1, 3, 2, 5 | 5 5
        //        size=9 | 7, 8, 5, 1, 9, 4, 6, 2, 9 | 9 5
        //        size=10 | 6, 8, 50, 2, 90, 4, 6, 90, 10, 10 | 0

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 1;

        System.out.print("_ ");
        int first = in.nextInt();
        u++;

        System.out.print("_ ");
        int second = in.nextInt(), oddIndex = 0;
        u++;

        int odd = 0, third;

        while (u <= size) {

            System.out.print("_ ");
            third = in.nextInt();

            if (first < second) {

                if ((second < third) && (third % 2 != 0)) {
                    second = third;
                    odd = second;
                    oddIndex = u;
                } else if ((second < third) && (third % 2 == 0)) {
                    second = third;
                } else {
                    u++;
                    continue;
                }
            } else {
                first = second;
                second = third;
            }
            u++;
        }
        System.out.println((odd == 0 && oddIndex == 0) ? 0 : odd + " " + oddIndex);
    }

    private static void minMax8() {
        // minMax8)
        // N natural soni va N ta butun sondan iborat to'plam berilgan.
        // Oxirgi uchragan eng katta elementni va keyin turgan elementlar sonini
        // aniqlovchi dastur tuzilsin. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 1, 3, 2, 5 | 5 0
        //        size=9 | 9, 8, 5, 1, 9, 4, 6, 2, 3 | 9 4
        //        size=10 | 6, 8, 50, 2, 90, 4, 6, 90, 10, 10 | 90 2

        System.out.print("Enter the size of N: ");
        int size = in.nextInt(), u = 1;

        print_();
        int first = in.nextInt();
        u++;

        print_();
        int second = in.nextInt();
        u++;

        int secondIndex = 0, third;

        while (u <= size) {

            print_();
            third = in.nextInt();

            if (first < second) {

                if ((second <= third)) {
                    second = third;
                    secondIndex = u;
                }
            } else {
                first = second;
                second = third;
                secondIndex = u;
            }
            u++;
        }
        System.out.println(second + " " + ((u - 1) - secondIndex));
    }

    private static void minMax9() {
        // minMax9)
        // N natural soni va N ta butun sondan iborat to'plam berilgan (N > 2).
        // To'plamdagi eng kichik 2 ta qiymatni aniqlovchi programma tuzilsin.
        // Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 6, 7, 8, 9 | 1 2
        //        size=9 | 9, 8, 5, 1, 9, 4, 6, 2, 3 | 1 2
        //        size=10 | 6, 8, 5, 2, 1, 4, 9, 7, 11, 12 | 1 2

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 1;

        print_();
        int min1 = in.nextInt();
        u++;

        print_();
        int min2 = in.nextInt();

        if (min1 > min2) {
            min2 += min1;
            min1 = min2 - min1;
            min2 -= min1;
        }

        int temp;

        while (u < size) {
            u++;

            print_();
            temp = in.nextInt();

            if (temp < min1 && min1 < min2) {
                min2 = min1;
                min1 = temp;
            } else if (min1 < temp && temp < min2) {
                min2 = temp;
            }
        }
        System.out.println(min1 + " " + min2);
    }

    private static void minMax10() {
        // minMax10)
        // N natural soni va N ta butun sondan iborat to'plam berilgan(N>1).
        // Ikkita qo'shni son yig'indisining eng katta qiymatini aniqlovchi
        // programma tuzilsin. Massivdan foydalanmang.
        // misol: size=9 | 1, 2, 3, 4, 5, 6, 7, 8, 9 | 17
        //        size=9 | 9, 8, 5, 1, 9, 4, 6, 2, 3 | 17
        //        size=10 | 6, 8, 5, 2, 1, 4, 9, 7, 11, 12 | 23

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 1;

        int firstNeighbor = 0, secondNeighbor, neighborSum = 0;

        print_();
        firstNeighbor = in.nextInt();

        while (u < size) {

            print_();
            secondNeighbor = in.nextInt();


            if (firstNeighbor + secondNeighbor > neighborSum) {
                neighborSum = firstNeighbor + secondNeighbor;
            }

            firstNeighbor = secondNeighbor;

            u++;
        }

        System.out.println(neighborSum);
    }


    private static void print_() {
        System.out.print("_ ");
    }
}