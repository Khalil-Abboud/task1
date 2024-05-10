package sorter.impl;

import sorter.Sorter;

public class SelectionSort implements Sorter {
    public void sorter(int[] myArray) {
        int n = myArray.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = myArray[minIndex];
            myArray[minIndex] = myArray[i];
            myArray[i] = temp;
        }
    }
}
