package Searching;

public class InsertionSort {
        public int array[];


        InsertionSort(int array[]) {
            this.array = array;
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


        //quick sort

        public void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
}
