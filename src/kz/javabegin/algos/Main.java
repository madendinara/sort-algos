package kz.javabegin.algos;

public class Main {

    public static void main(String[] args) {
        int[] arr = {34, 3, 5, -4, 12, 4, -9, 1};
        Example.insertionSort(arr);
//        int index = BinarySearch.binary(arr, 12, 0, arr.length - 1);
//        System.out.println(index);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
