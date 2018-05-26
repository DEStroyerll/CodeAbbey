package Codeabbey;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Программа которая подсчитывает
 * сколько раз каждый номер встречается в массиве
 */
public class ArrayCounters {

    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        int[] array = {};

        int element = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (countElement(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        element = array[j];
                        arrayList.add(array[i]);

                    }
                }

            }
            if (count > 1)
                System.out.println("element = " + element + "; match count = " + count);
            count = 0;

        }

    }

    private static boolean countElement(int arrIndex) {
        for (int k = 0; k < arrayList.size(); k++) {
            if (arrIndex == arrayList.get(k))
                return false;
        }
        return true;
    }

    public void method() {
        Scanner scanner = new Scanner(System.in);
        // scan number of values
        int num = scanner.nextInt();
        //scan number of variable values and create array for count
        int[] count = new int[scanner.nextInt()];
        //calculate count of values
        for (int i = 0; i < num; i++) {
            int value = scanner.nextInt();
            count[value - 1]++;
        }
        scanner.close();
        //print result
        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
