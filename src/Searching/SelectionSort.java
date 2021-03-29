package Searching;

public class SelectionSort {

        public int array[];


        SelectionSort(int array[]) {
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



        public void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }



}
