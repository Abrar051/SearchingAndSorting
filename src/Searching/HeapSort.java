package Searching;


    // Java program for implementation of Heap Sort
    public class HeapSort {
        public int[] array;

        HeapSort (int array[])
        {
            this.array=array;
        }

        public void sort(int array[]) {
            int n = array.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(array, n, i);

            // One by one extract an element from heap
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // call max heapify on the reduced heap
                heapify(array, i, 0);
            }
        }

        // To heapify a subtree rooted with node i which is
        // an index in arr[]. n is size of heap
        void heapify(int arr[], int n, int i) {
            int largest = i; // Initialize largest as root
            int l = 2 * i + 1; // left = 2*i + 1
            int r = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l;

            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            }
        }

        /* A utility function to print array of size n */
        public void printArray() {
            int n = array.length;
            for (int i = 0; i < n; ++i)
                System.out.print(array[i] + " ");
            System.out.println();
        }

}
