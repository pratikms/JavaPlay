package project.java.mergesort;

import java.lang.reflect.Array;

public class Custom {

    int length;
    int[] tempArray;
    int[] arr;

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Custom obj = new Custom();
        obj.sort(intArray);

    }

    public void sort(int[] intArray) {

        this.arr = intArray;
        this.length = intArray.length;
        this.tempArray = new int[length];

        divideArray(0, this.length - 1);

        for (int item :
                this.arr) {
            System.out.println(item);
        }

    }

    public void divideArray(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Divides left array
            divideArray(lowerIndex, middle);

            // Divides right array
            divideArray(middle + 1, higherIndex);

            // Merge array
            mergeArray(lowerIndex, middle, higherIndex);

        }

    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {

        for (int i = 0; i < this.arr.length; i++) {
            this.tempArray[i] = this.arr[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {

            if (this.tempArray[i] <= this.tempArray[j]) {
                this.arr[k] = this.tempArray[i];
                i++;
            }
            else {
                this.arr[k] = this.tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            this.arr[k] = this.tempArray[i];
            i++;
            k++;
        }

        while (j <= middle) {
            this.arr[k] = this.tempArray[j];
            j++;
            k++;
        }

    }

}
