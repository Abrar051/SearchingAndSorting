package Searching;

public class search {
    int array[];

    search(int array[]) {
        this.array = array;
    }

    public void binarySearch(int index) {
        int first = 0;
        int last = array.length - 1;
        sort();
        while (true) {
            int mid = (first + last) / 2;
            if (index > mid) {
                System.out.println("Step : " + "1st :" + first + " last : " + last + " mid : " + mid);
                first = mid + 1;
            } else if (index < mid) {
                System.out.println("Step : " + "1st :" + first + " last : " + last + " mid : " + mid);
                last = mid - 1;
            }
            if (mid == index) {
                System.out.println("Fount it");
                System.out.println(array[mid - 1]);
                break;
            }
            if (index > last) {
                System.out.println("Index out of bound ");
                break;
            }

        }
    }



    public int binarySearchRecursion(int x)
    {
        int first = 0, last = array.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] < x)
                first = mid + 1;
            else
                last = mid - 1;
        }
        return -1;
    }

    public void linearSearch(int element) {
        for (int i = 0; i < array.length; i++) {
            if (this.array[i] == element) {
                System.out.println("Found at index : " + i);
            }
        }
    }

    public void sort() {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }
}
