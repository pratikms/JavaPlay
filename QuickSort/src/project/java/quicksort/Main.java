package project.java.quicksort;

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

        // Using the first element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}
