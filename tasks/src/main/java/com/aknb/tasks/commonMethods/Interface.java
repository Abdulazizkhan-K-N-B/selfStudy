package com.aknb.tasks.commonMethods;

public interface Interface {

    public void print_();

    public void swapper(Integer x, Integer y);

    public boolean isLeapYear(int year);

    public boolean isPalindrom(int number);

    public boolean isTub(int n);

    public boolean isPrime(int n);

    public boolean isLetter(char letter);

    public int digitCounter(int input);

    public int digitN(int input, int number);

    public int EKUB(int A, int B);

    public int EKUK(int A, int B);

    public int EKUB3(int a, int b, int c);

    public int monthDays(int month, int year);

    public int frequencyCounter(String[] inputArr, int temp);

    public int getMinFromArray(int[] intArr);

    public int[] prevDate(int day, int month, int year);

    public int[] nextDate(int day, int month, int year);

    public int[] bubbleSort(int[] nums);

    public int[] selectionSort(int[] nums);

    public int[] insertionSort(int[] nums);

    public int[] arrStringToInt(String[] strArr);

    public int[][] inFullArray(int m, int n);

    public int[][] matrixSpiral(int m, int n, int[] intArr);

    public int[][] matrixRowByRow(int m, int n, int[] intArr);

    public char withOrder(char[] letters);

    public char[] getLettersInCharArr(char[] charArr);
}