package Searching;

public class QuickSort {

    public int array[];

    QuickSort (int array[]) {
        this.array=array;
    }
    public int partition(int low, int high) {

        // pivot
        int pivot = array[high];
        int i = (low - 1); //define the counter from the left side of the pivot

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

