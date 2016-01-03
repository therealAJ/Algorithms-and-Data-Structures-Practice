package SortingAlgorithms;

/**
 * Created by Alex on 12/17/2015.
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int minIndex, temp;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String[] args) {

        int[] toSort = {1, 6, 7, 9, 21323, 5, 6, 12, 234, 3, 8};

        System.out.println("Array Before Selection Sort");
        for (int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i] + " ");
        }

        selectionSort(toSort);

        System.out.println("");

        System.out.println("Array After Selection Sort");
        for (int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i] + " ");
        }


    }

}




