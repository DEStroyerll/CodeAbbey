package Codeabbey;
/**
 * Модульный калькулятор. Решение через класс Scanner
 * с применением класса BigInteger
 */

import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {
    public static void main(String[] args) {
        System.out.println(calculate());

    }

    private static int calculate() {
        Scanner sc = new Scanner(System.in);
        BigInteger result = sc.nextBigInteger();
        String sign;
        BigInteger num;
        while (true) {
            sign = sc.next();
            num = sc.nextBigInteger();
            if (sign.equals("+")) {
                result = result.add(num);
            } else if (sign.equals("*")) {
                result = result.multiply(num);
            } else if (sign.equals("%")) {
                result = result.mod(num);
                break;
            }
        }
        return result.intValue();
    }
}