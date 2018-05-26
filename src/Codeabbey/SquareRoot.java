package Codeabbey;
/**
 * Квадратный корень числа
 * Задание с сайта CodeAbbey
 * За полной информацией задания перейти
 * на сайт http://www.codeabbey.com/index/task_view/square-root
 */

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float r;
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            int x = scan.nextInt();
            int n = scan.nextInt();
            r = 1;
            for (int j = 0; j < n; j++) {
                r = (r + x / r) / 2;
            }
            System.out.print(r + " ");
        }

    }

}
