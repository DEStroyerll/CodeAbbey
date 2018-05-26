package Codeabbey;

import java.util.Scanner;

/**
 * Программа которая вычисляет сумму цифр
 * но при этом каждую цифру умножает на свою позицию
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.method();

    }

    public static int getSum(int num) {
        int sum = 0, count = 0;
        int m = num;
        while (m > 0) { //Считаем количество цифр в числе
            m /= 10;
            count++;
        }
        for (int i = count; i > 0; i--) {
            sum += i * (num % 10);
            num /= 10;
        }
        return sum;
    }

    public void method() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            int result = 0;
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                result += (Character.digit(s.charAt(j), 10) * (j + 1));
            }
            System.out.print(result + " ");
        }
    }

}
