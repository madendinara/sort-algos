package kz.javabegin.algos;

public class SelectionSort {

    public static void selection() {

        int[] arr = {20, 35, -5, 3, 45, -22, 1};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
