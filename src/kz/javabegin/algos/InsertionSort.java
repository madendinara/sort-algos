package kz.javabegin.algos;

public class InsertionSort {

    public static void insertion() {
        int[] arr = {20, 35, -5, 3, 45, -22, 1};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int current = arr[firstUnsortedIndex];
            int lastSortedIndex = firstUnsortedIndex - 1;

            while (lastSortedIndex >= 0 && current < arr[lastSortedIndex]){
                arr[lastSortedIndex + 1] = arr[lastSortedIndex];
                lastSortedIndex--;
            }
            arr[lastSortedIndex + 1] = current;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
