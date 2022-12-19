package uz.aknb.tasks.common;
import java.util.Objects;

public class Common implements Interface {

    @Override
    public void print_() {
        System.out.print("_ ");
    }

    @Override
    public void swapper(Integer x, Integer y) {

        x += y;
        y = x - y;
        x -= y;
    }

    @Override
    public int[] arrStringToInt(String[] strArr, int size) {
        int[] intArr = new int[size];

        for (int u = 0; u < size; u++) {

            intArr[u] = Integer.valueOf(strArr[u]);
        }
        return intArr;
    }

    @Override
    public int[] invert(int[] arr, int size) {

        for (int i = 0; i < size / 2; i++) {

            arr[i] += arr[size - i];
            arr[size - i] = arr[i] - arr[size - i];
            arr[i] -= arr[size - i];
        }
        return arr;
    }

    @Override
    public int[][] inFullArray(int m, int n, String[] arr) {
        System.out.print("array: ");

        return matrixRowByRow(
                m,
                n,
                arrStringToInt(arr, m * n));
    }

    @Override
    public boolean isPalindrom(int number) {
        int digitCount = digitCounter(number);

        int c = 0;

        while (digitCount > c) {
            c++;
            if (!Objects.equals(digitN(number, c), digitN(number, digitCount))) {
                return false;
            }
            digitCount--;
        }

        return true;
    }

    @Override
    public boolean isTub(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n == 1) ? false : true;
    }

    @Override
    public boolean isLetter(char letter) {

        try {

            Integer.parseInt(String.valueOf(letter));
        } catch (Exception e) {

            return true;
        }
        return false;
    }

    @Override
    public char withOrder(char[] letters) {

        int firstNeighbor, secondNeighbor;
        for (byte i = 0; i < letters.length - 1; i++) {

            firstNeighbor = letters[i];
            secondNeighbor = letters[i + 1];

            if (firstNeighbor > secondNeighbor) {
                return letters[i + 1];
            }
        }
        return 48;
    }

    @Override
    public int digitCounter(int input) {
        int u = 0;

        while (input > 0) {
            input /= 10;
            u++;
        }
        return u;
    }

    @Override
    public int digitN(int input, int number) {
        int targetNumber = -1;
        int digitCount = digitCounter(input);

        if (digitCount - number >= 0) {
            number = (digitCount - number) + 1;
            while (number > 0) {
                targetNumber = input % 10;
                input /= 10;
                number--;
            }
        }
        return targetNumber;
    }

    @Override
    public int EKUB(int A, int B) {

        int EKUB = 0;
        for (int i = 1; i <= Math.min(A, B); i++) {

            if (A % i == 0 && B % i == 0) {

                EKUB = i;
            }
        }

        return EKUB;
    }

    @Override
    public int EKUK(int A, int B) {

        return A * B / EKUB(A, B);
    }

    @Override
    public int EKUB3(int a, int b, int c) {
        int EKUB3 = 0;
        int min = Math.min(Math.min(a, b), c);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0
                    && b % i == 0
                    && c % i == 0) {

                EKUB3 = i;
            }
        }

        return EKUB3;
    }

    @Override
    public boolean isLeapYear(int year) {

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    return true;
                } else {

                    return false;
                }
            } else {

                return true;
            }
        } else {

            return false;
        }
    }

    @Override
    public int monthDays(int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2: {
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    @Override
    public int[] prevDate(int day, int month, int year) {

        day--;
        if (day == 0) {
            month--;
            if (month == 0) {
                year--;
                month = 12;
                day = 31;
            } else {
                day = monthDays(month, year);
            }
        }

        return new int[] { day, month, year };
    }

    @Override
    public int[] nextDate(int day, int month, int year) {

        int thisMonthDay = monthDays(month, year);
        day++;
        if (day > thisMonthDay) {

            month++;
            if (month > 12) {
                year++;
                month = 1;
                day = 1;
            } else {
                day = 1;
            }
        }

        return new int[] { day, month, year };
    }

    @Override
    public int frequencyCounter(String[] inputArr, int temp) {
        int u = 0;

        for (int i = 0; i < inputArr.length; i++) {

            if (Integer.valueOf(inputArr[i]) == temp) {
                u++;
            }
        }

        return u;
    }

    @Override
    public int getMinFromArray(int[] array){
        int min = array[0], u = 1;

        while (u < array.length){

            if (array[u] < min){

                min = array[u];
            }
        }
        return min;
    }

    @Override
    public int[] bubbleSort(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    nums[j] += nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] -= nums[j + 1];
                }
            }
        }
        return nums;
    }

    @Override
    public int[] selectionSort(int nums[]) {

        int size = nums.length, minInd;
        for (int i = 0; i < size; i++) {

            minInd = i;
            for (int j = i + 1; j < size; j++) {

                if (nums[minInd] > nums[j]) {
                    minInd = j;
                }
            }

            if (minInd != i) {
                nums[i] += nums[minInd];
                nums[minInd] = nums[i] - nums[minInd];
                nums[i] -= nums[minInd];
            }
        }
        return nums;
    }

    @Override
    public int[] insertionSort(int nums[]) {

        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (nums[j] < nums[j - 1]) {

                    nums[j] += nums[j - 1];
                    nums[j - 1] = nums[j] - nums[j - 1];
                    nums[j] -= nums[j - 1];
                } else {

                    break;
                }
            }
        }

        return nums;
    }

    @Override
    public int[][] matrixSpiral(int m, int n, int[] names) {

        int[][] matrix = new int[m][n];

        int l = 0;
        for (int i = 0; i < m; i += 2) {

            for (int x = 0; x < n; x++) {

                matrix[i][x] = names[l];
                l++;
            }

            for (int y = n - 1; y >= 0; y--) {

                matrix[i + 1][y] = names[l];
                l++;
            }
        }

        return matrix;
    }

    @Override
    public int[][] matrixRowByRow(int m, int n, int[] names) {

        int[][] matrix = new int[m][n];

        int l = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = names[l];
                l++;
            }
        }

        return matrix;
    }

    @Override
    public char[] getLettersInCharArr(char[] charArr) {

        byte letterCount = 0;
        char[] lettersMain = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {

            if (isLetter(charArr[i])) {

                lettersMain[letterCount] = charArr[i];
                letterCount++;
            }
        }

        char[] letters = new char[letterCount];
        for (int j = 0; j < letterCount; j++) {

            letters[j] = lettersMain[j];
        }
        return letters;
    }
}
