import java.util.*;

public class BubbleSort {
    public static void search(int i, int j, int arr1[]) {
        int temp;
        int length = arr1.length;
        for (i = 0; i < length - 1; i++) {
            for (j = 0; j < length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

    }

    public static void printArray(int i, int arr1[]) {
        int length = arr1.length;
        for (i = 0; i < length; i++) {
            System.out.println("" + arr1[i]);
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
        int i = 0;
        int j = 0;
        search(i, j, arr1);
        printArray(i, arr1);
    }
}
