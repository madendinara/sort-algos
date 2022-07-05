package kz.javabegin.algos;

public class BinarySearch {
    // 3 5 7 8 12 19 20 21 45 56 - 10
    public static int binary(int[] arr, int number, int lowIndex, int highIndex) {
        while (lowIndex <= highIndex){
            int middle = 1 + (highIndex - 1) / 2;
            if (arr[middle] == number) {
                return middle;
            }
            else if (arr[middle] < number) {
                return binary(arr, number, middle + 1, highIndex);
            }
            else {
                return binary(arr, number, lowIndex, middle - 1);
            }
        }
        return -1;
    }
}
