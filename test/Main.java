public class Main {
    /*
     * Реализовать интерфейс сортировщик
     * Реализовать три имплементации интерфейса
     * Вывести в консоль результаты работы на примере из массива 10 чисел
     */
    public static void main(String[] args) {

        int[] arr1 = { 8, 4, 1, 9, 2, 0, 6, 3, 7, 5 };

        System.out.println("Array before sorting:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        BubbleSort BS = new BubbleSort();
        BS.sorter(arr1);

        System.out.println("\nArray after BubbleSort sorting:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        int[] arr2 = { 15, 44, 2, 34, 70, 15, 7, 18, 90, 57 };

        System.out.println("\nArray before sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        SelectionSort SS = new SelectionSort();
        SS.sorter(arr2);

        System.out.println("\nArray after SelectionSort sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        int[] arr3 = { 18, 90, 7, 28, 45, 2, 256, 1024, 512, 64 };

        System.out.println("\nArray before sorting:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }

        InsertionSort IS = new InsertionSort();
        IS.sorter(arr3);

        System.out.println("\nArray after InsertionSort sorting:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        int[] arr4 = { 8, 105, 77, 3, 1001, 555, 24, 65, 29, 99 };

        System.out.println("Array before sorting:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        MergeSort MS = new MergeSort();
        MS.mergeSort(arr4);

        System.out.println("\nArray after MergeSort sorting:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
    }
}
