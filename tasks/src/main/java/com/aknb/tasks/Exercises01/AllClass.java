package com.aknb.tasks.Exercises01;

import java.util.Scanner;
import com.aknb.tasks.commonMethods.Common;
import com.aknb.tasks.commonMethods.Interface;

public class AllClass implements AllInterface {

    private Scanner in = new Scanner(System.in);
    private Interface commonMethods = new Common();

    @Override
    public void if1() {

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

    @Override
    public void if2() {

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

    @Override
    public void math1() {

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

    @Override
    public void switch1() {

        Integer day, month;

        System.out.print("Enter the day: ");
        day = in.nextInt();
        System.out.print("Enter the month: ");
        month = in.nextInt();

        int dayOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                dayOfMonth = 31;
                break;
            }
            case 2: {
                dayOfMonth = 28;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                dayOfMonth = 30;
                break;
            }
            default:
                System.out.println("Bunday oy yo'q!");
        }
        if (day <= dayOfMonth) {
            if (day < dayOfMonth) {
                day++;
            } else {
                month += 1;
                day = 1;
            }
            System.out.printf("%02d.%02d\n", day, month);
        } else {
            System.out.println("Bunday sana yo'q!");
        }
    }

    @Override
    public void for1() {

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

    @Override
    public void for2() {

        System.out.print("Enter the N: ");
        int N = in.nextInt();

        for (int i = 2; i <= N; i++) {
            if (commonMethods.isTub(i)) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void for3() {

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

    @Override
    public void while1() {

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

    @Override
    public void while2() {

        System.out.print("Enter the N: ");
        int n = in.nextInt(), u = 0, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
            u++;
        }
        System.out.printf("%d %d", u, sum);
    }

    @Override
    public void for4() {

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

    @Override
    public void math2() {

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

    @Override
    public void minMax1() {

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

    @Override
    public void minMax2() {

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

    @Override
    public void minMax3() {

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

    @Override
    public void minMax4() {

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

    @Override
    public void minMax5() {

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

    @Override
    public void minMax6() {

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

    @Override
    public void minMax7() {

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

    @Override
    public void minMax8() {

        System.out.print("Enter the size of N: ");
        int size = in.nextInt(), u = 1;

        commonMethods.print_();
        int first = in.nextInt();
        u++;

        commonMethods.print_();
        int second = in.nextInt();
        u++;

        int secondIndex = 0, third;

        while (u <= size) {

            commonMethods.print_();
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

    @Override
    public void minMax9() {

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 1;

        commonMethods.print_();
        int min1 = in.nextInt();
        u++;

        commonMethods.print_();
        int min2 = in.nextInt();

        if (min1 > min2) {
            min2 += min1;
            min1 = min2 - min1;
            min2 -= min1;
        }

        int temp;

        while (u < size) {
            u++;

            commonMethods.print_();
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

    @Override
    public void minMax10() {

        System.out.print("Enter the size of the N: ");
        int size = in.nextInt(), u = 1;

        int firstNeighbor = 0, secondNeighbor, neighborSum = 0;

        commonMethods.print_();
        firstNeighbor = in.nextInt();

        while (u < size) {

            commonMethods.print_();
            secondNeighbor = in.nextInt();

            if (firstNeighbor + secondNeighbor > neighborSum) {
                neighborSum = firstNeighbor + secondNeighbor;
            }

            firstNeighbor = secondNeighbor;

            u++;
        }

        System.out.println(neighborSum);
    }

    @Override
    public void funSimple1() {
        System.out.print("Enter the size of the N: ");
        int size = in.nextInt();
        int input, primeNumbersCount = 0;

        for (int i = 1; i <= size; i++) {

            System.out.print("_ ");
            input = in.nextInt();

            if (commonMethods.isPrime(input)) {
                primeNumbersCount++;
            }
        }

        System.out.println(primeNumbersCount);
    }

    @Override
    public void funSimple2() {

        System.out.print("DigitCount: k= ");
        int input = in.nextInt();
        System.out.println(
                commonMethods.digitCounter(input));
    }

    @Override
    public void funSimple3() {

        System.out.print("DigitN(K, N) k= ");
        int input = in.nextInt();
        System.out.print("n= ");
        int number = in.nextInt();

        System.out.println(
                commonMethods.digitN(input, number));
    }

    @Override
    public void funSimple4() {

        System.out.print("isPalindrom(N) n= ");
        int number = in.nextInt();

        for (int i = 1; i < 3; i++) {
            // TODO:
        }

        System.out.println(commonMethods.isPalindrom(number));
    }

    @Override
    public void funSimple5() {

        System.out.print("function EKUB(A, B)\nA= ");
        int A = in.nextInt();
        System.out.print("B= ");
        int B = in.nextInt();

        System.out.println(commonMethods.EKUB(A, B));
    }

    @Override
    public void funSimple6() {

        System.out.print("function EKUK(A, B)\nA= ");
        int A = in.nextInt();
        System.out.print("B= ");
        int B = in.nextInt();

        System.out.println(commonMethods.EKUK(A, B));
    }

    @Override
    public void funSimple7() {

        System.out.print("function EKUB3(A, B, C)\nA= ");
        int A = in.nextInt();
        System.out.print("B= ");
        int B = in.nextInt();
        System.out.print("C= ");
        int C = in.nextInt();

        System.out.println(commonMethods.EKUB3(A, B, C));
    }

    @Override
    public void funSimple8() {

        System.out.print("EKUB() till N \nN= ");
        int size = in.nextInt();
        in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.valueOf(arr[i]);
        }

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int EKUB = 0;

        continuer: for (int i = 1; i <= min; i++) {

            for (int num : nums) {
                if (num % i != 0) {
                    continue continuer;
                }
            }
            EKUB = i;
        }

        System.out.println(EKUB);
    }

    @Override
    public void funSimple9() {

        int leapYearCount = 0;

        System.out.print("Leap year counter! Enter the years.");
        String[] years = in.nextLine().split(" ");
        for (String year : years) {

            if (commonMethods.isLeapYear(
                    Integer.valueOf(year))) {

                leapYearCount++;
            }

        }

        System.out.println("Leap years count is: " + leapYearCount);
    }

    @Override
    public void funSimple10() {

        System.out.print("MothDays(month, year) function.\nYear: ");
        int year = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Months: ");
        String[] months = in.nextLine().split(" ");

        for (int i = 0; i < months.length; i++) {

            System.out.print(commonMethods.monthDays(Integer.valueOf(months[i]), year) + " ");
        }
    }

    @Override
    public void funSimple11() {

        int day, month, year;

        System.out.print("PreavDate(D, M, Y) function.(format: 1 3 2020)");
        String[] input = in.nextLine().split(" ");

        day = Integer.valueOf(input[0]);
        month = Integer.valueOf(input[1]);
        year = Integer.valueOf(input[2]);

        if (commonMethods.monthDays(month, year) != 0) {
            
            int[] output = commonMethods.prevDate(day, month, year);
            System.out.printf("%d/%d/%d\n", output[0], output[1], output[2]);
        } else {
            System.out.println("Bunday sanan yo'q");
        }
    }
}
