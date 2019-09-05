package project.java.insertionsort;

public class Main {

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex <= intArray.length - 1; firstUnsortedIndex++) {
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (intArray[i] > intArray[firstUnsortedIndex]) {
                    swap(intArray, i, firstUnsortedIndex);
                    firstUnsortedIndex = i;
                }
            }
        }

        for (int i :
                intArray) {
            System.out.println(i);
        }

    }
}
