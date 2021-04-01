package Searching;

public class Sort {
    public int array[];


    Sort(int array[]) {
        this.array = array;
    }

    void printArray() {
        int n = array.length;
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }




    //quick sort

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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


}
