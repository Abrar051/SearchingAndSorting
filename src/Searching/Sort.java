package Searching;

public class Sort {
    public int array[];


    Sort(int array[]) {
        this.array = array;
    }

    public void mergeSort(int array[]) {
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

    public void insertionSort() {
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

    public void mergeSort() {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(array[0], array[i]);
            heapify(i, 0);
        }
    }

    public void heapify(int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && array[l] > array[largest])
            largest = l;
        if (r < n && array[r] > array[largest])
            largest = r;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(n, largest);
        }
    }

    public void merge(int l, int m, int r) {
        int n1 = m - l + 1; // 2 subarray merge sort length
        int n2 = r - m;

        int left[] = new int[n1];//temporary arrays
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++)//copy data to temp arrays
            left[i] = array[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = array[m + 1 + j];

        int i = 0, j = 0;
        int k = l;  // Initial indexes of first and second subArrays
        while (i < n1 & j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }


    public void mergeSort(int array[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(l, m, r);
        }
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

    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }
}
