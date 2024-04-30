import java.util.Scanner;
import sorter.impl.BubbleSort;
import sorter.impl.InsertionSort;
import sorter.impl.MergeSort;
import sorter.impl.SelectionSort;

public class Main {
    /*
     * Реализовать интерфейс сортировщик
     * Реализовать 4 имплементации интерфейса
     * Вывести в консоль результаты работы на примере из массива 10 чисел
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        System.out.println("enter the range of the generated sequences (integer)");
        System.out.println("min value = ");
        int a = input.nextInt();
        System.out.println("max value = ");
        int b = input.nextInt();
        SequenceGen.sequenceGen(arr1,a,b);
        SequenceGen.sequenceGen(arr2,a,b);
        SequenceGen.sequenceGen(arr3,a,b);
        SequenceGen.sequenceGen(arr4,a,b);
        System.out.println("An array before sorting:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        BubbleSort BS = new BubbleSort();
        BS.sorter(arr1);

        System.out.println("\nThe array after BubbleSort sorting:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        System.out.println("\nAn array before sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        SelectionSort SS = new SelectionSort();
        SS.sorter(arr2);

        System.out.println("\nThe array after SelectionSort sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        System.out.println("\nAn array before sorting:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }

        InsertionSort IS = new InsertionSort();
        IS.sorter(arr3);

        System.out.println("\nThe array after InsertionSort sorting:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        // ---------------------------------------------------------
        System.out.println("\nAn array before sorting:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        MergeSort MS = new MergeSort();
        MS.mergeSort(arr4);

        System.out.println("\nThe array after MergeSort sorting:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
    }
}
