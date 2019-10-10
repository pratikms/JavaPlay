package project.java.quicksort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int i :
                intArray) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] input, int start, int end) {

        // Checking if we are dealing with a one element array
        if (end - start < 2) {
            return;
        }

        // If dealing with more than one element array
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end - 1;

        while (i < j) {
            if (input[i] == pivot) {
                if (pivot > input[j]) {
                    input[i] = input[j];
                    input[j] = pivot;
                    i++;
                } else {
                    j--;
                }
            } else if (input[j] == pivot) {
                if (pivot < input[i]) {
                    input[j] = input[i];
                    input[i] = pivot;
                    j--;
                } else {
                    i++;
                }
            }
        }

        return Arrays.binarySearch(input, pivot);
    }
}
