package Codeabbey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Методы которые вычесляют минимальное число
 * из трех введенных с клавиатуры при помощи
 * коллекции ArrayList и сортировки класса Arrays.sort
 */
public class LeastThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a, b, c;
        for (int i = 0; i < number; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if ((a < b) && (c > a)) {
                System.out.println(a);
            } else if ((a > b) && (b < c)) {
                System.out.println(b);
            } else if ((c < a) && (b > c)) {
                System.out.println(c);
            }
            break;
        }

    }

    public void method2() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int numbers = scan.nextInt();
        for (int i = 0; i < numbers; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a < b && a < c)
                arrayList.add(a);
            else if (b < a && b < c)
                arrayList.add(b);
            else arrayList.add(c);
        }

        for (int result : arrayList)
            System.out.print(result + " ");
    }

    public void method3() {
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        for (int i = 1; i <= numbers; i++) {
            int[] a = new int[3];
            for (int j = 0; j < 3; j++) {
                a[j] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.print(a[0] + " ");
        }
    }
}








