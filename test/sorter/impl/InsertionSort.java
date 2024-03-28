public class InsertionSort implements Sorter {
    public void sorter(int[] myArray) {
        int n = myArray.length;

        for (int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j--;
            }

            myArray[j + 1] = key;
        }
    }
}
