package kz.javabegin.algos;

public class InsertionSort {

    public static void insertion() {
        int[] arr = {45, 56, 1, 3, -5, 34};

        for (int i = 1; i < arr.length; i++) {

            int currentValue = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
