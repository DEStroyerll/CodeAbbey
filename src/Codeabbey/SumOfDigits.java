package Codeabbey;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Программа которая умножает, а затем суммирует
 * введенные с клавиатуры числа.
 * А затем каждую цифру полученной суммы, плюсует друг к другу
 * и выводит результат в консоль.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.method1();
    }

    public void method1() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int value;
        int sum;
        for (int i = 0; i < length; i++) {
            sum = 0;
            value = scanner.nextInt() * scanner.nextInt() + scanner.nextInt();
            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
            System.out.print(sum + " ");
        }
    }

    public void method2() {
        try {
            Scanner s = new Scanner(System.in);
            ArrayList<Long> arrayList = new ArrayList<>();
            int value = s.nextInt();
            while (value > 0) {
                long a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
                c += a * b;
                a = 0;
                while (c > 0) {
                    a += c % 10;
                    c /= 10;
                }
                arrayList.add(a);
                value--;
            }
            s.close();
            for (Long i : arrayList) {
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
