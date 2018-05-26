package Codeabbey;

import java.util.Scanner;

/**
 * Контрольная сумма массива
 * Проблема № 17 (CodeAbbey)
 */
public class ArrayChecksum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long array[] = new long[scanner.nextInt()];

        long seed = 113;
        long limit = 10000007;
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            result = ((result + array[i]) * seed) % limit;
        }
        System.out.println(result);
    }

}
