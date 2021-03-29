package Searching;

public class Main {
    public static void main(String[] args) {
        int array[] = {12,32,62,72,83,95,21,34,45,57,100,122,116};
        search search = new search(array);
        Sort selectionSort = new Sort(array);
        Sort insertionSort = new Sort(array);
        Sort heapSort = new Sort(array);
        Sort mergeSort = new Sort(array);
        Sort quickSort = new Sort(array);
        search.sort();
        for (int i=0;i<array.length;i++)
        {
            System.out.print(search.array[i]+" ");
        }
        System.out.println();
        search.binarySearch(12);
        //selection sort
        selectionSort.selectionSort();
        selectionSort.printArray();
        //insertion sort
        insertionSort.insertionSort();
        insertionSort.printArray();
        //heap sort
        heapSort.mergeSort();
        heapSort.printArray();
        //merge sort
        mergeSort.mergeSort(array,0, array.length-1);
        mergeSort.printArray();

        //quick sort
        quickSort.quickSort(0, array.length-1);
        quickSort.printArray();

    }
}
