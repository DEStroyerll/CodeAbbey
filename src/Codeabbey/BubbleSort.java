package Codeabbey;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr1[] = {3, 12, 1, 16, 14, 18, 15, 20, 4, 9, 8, 10, 6 ,2 ,11, 5, 7, 19, 13, 17};
        boolean flag;
        int temp;
        do {
            flag = false;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        System.out.println(Arrays.toString(arr1));
    }
}
