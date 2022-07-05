package kz.javabegin.algos;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        int arrLen = arr.length;

        if (arrLen < 2) {
            return;
        }

        int middle = arrLen / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrLen - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = arr[i];
        }

        for (int i = middle; i < arrLen; i++) {
            rightArray[i - middle] = arr[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(arr, leftArray, rightArray);
    }

    public static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int leftLen = leftArray.length;
        int rightLen = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLen) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLen) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
