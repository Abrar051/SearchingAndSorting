package Searching;

public class Sort {
    public int array[];


    Sort(int array[])
    {
        this.array=array;
    }

    public void sort(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[minimum])
                    minimum = j;

            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
    }

    void printArray() {
        int n = array.length;
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public void selectionSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimum])
                    minimum = j;
            }
            swap(array[i], array[minimum]);
        }
    }

    public void insertionSort()
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}
