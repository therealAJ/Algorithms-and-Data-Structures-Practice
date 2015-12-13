package SortingAlgorithms;

/**
 * Created by Alex on 12/12/2015.
 */
public class BubbleSort {


    public static void bubbleSort(int[] toSort) {

        int temp;

        for (int i = 0; i < toSort.length; i++) {

            for (int j = 1; j < (toSort.length - i); j++) {


                if (toSort[j-1] > toSort[j]) {
                    temp = toSort[j-1];
                    toSort[j-1] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
    }



    public static void main(String [ ] args)
    {

        int[] toSort = {1,6,7,9,21323,5,6,12,234,3,8};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < toSort.length; i++){
            System.out.print(toSort[i] + " ");
        }

        bubbleSort(toSort);

        System.out.println("");

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < toSort.length; i++){
            System.out.print(toSort[i] + " ");
        }




    }








}



