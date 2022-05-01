package kz.javabegin.algos;

public class MergeSort {

    public static void mergeSort(int[] arr) {

        int arrLength = arr.length;

        if (arrLength < 2) {
            return;
        }

        int middle = arrLength / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[arrLength - middle];

        for(int i = 0; i < middle; i++) {
            leftHalf[i] = arr[i];
        }
        for(int i = middle; i < arrLength; i++) {
            rightHalf[i - middle] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr){
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                 arr[k] = rightArr[j];
                 j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftArr[i];
            i++;
            j++;
        }
        while (j < rightLength) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
