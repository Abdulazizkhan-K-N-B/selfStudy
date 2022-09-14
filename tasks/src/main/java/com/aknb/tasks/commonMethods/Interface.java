package com.aknb.tasks.commonMethods;

public interface Interface {

    public void print_();

    public void swapper(Integer x, Integer y);

    public int[] arrStringToInt(String[] strArr);

    public int[][] inFullArray(int m, int n);

    public boolean isPalindrom(int number);

    public boolean isTub(int n);

    public boolean isPrime(int n);

    public int digitCounter(int input);

    public int digitN(int input, int number);

    public int EKUB(int A, int B);

    public int EKUK(int A, int B);

    public int EKUB3(int a, int b, int c);

    public boolean isLeapYear(int year);

    public int monthDays(int month, int year);

    public int[] prevDate(int day, int month, int year);

    public int[] nextDate(int day, int month, int year);

    public int frequencyCounter(String[] inputArr, int temp);

    public int[] bubbleSort(int[] nums);

    public int[] selectionSort(int[] nums);

    public int[] insertionSort(int[] nums);

    public int[][] matrixSpiral(int m, int n, int[] intArr);

    public int[][] matrixRowByRow(int m, int n, int[] intArr);
}
