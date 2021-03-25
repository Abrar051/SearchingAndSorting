package Searching;

public class Main {
    public static void main(String[] args) {
        int array[] = {12,32,62,72,83,95,21,34,45,57,100,122,116};
        search search = new search(array);
        search.sort();
        for (int i=0;i<array.length;i++)
        {
            System.out.print(search.array[i]+" ");
        }
        System.out.println();
        search.binarySearch(12);

    }
}
