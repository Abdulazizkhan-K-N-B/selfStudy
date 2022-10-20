package org.aknb;

public class BinarySearch {
    static int binarySearch(int[] numbers, int num){
        int min = 0, u = 0;
        int max = numbers.length-1;

        while (min <= max){
            int mid = (min + max) / 2;
            int guess = numbers[mid];
            if (guess == num){
                System.out.println("Mid: " + mid + "\tGuess: " + guess + "\tCircle: " + u);
                return guess;
            }
            if (guess > num){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
            u++;
        }
        return 0;
    }
}
