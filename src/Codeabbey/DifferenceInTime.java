package Codeabbey;

import java.util.Scanner;

/**
 * Программа вычисляющая разницу между двумя датами
 * в значении день, час, минуты, секунды.
 */
public class DifferenceInTime {
    public static final int SECONDS = 60;
    public static final int MINUTES = 60;
    public static final int HOURS = 60 * 60;
    public static final int DAYS = 24 * 60 * 60;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int day1 = in.nextInt();
            int hour1 = in.nextInt();
            int min1 = in.nextInt();
            int sec1 = in.nextInt();
            int day2 = in.nextInt();
            int hour2 = in.nextInt();
            int min2 = in.nextInt();
            int sec2 = in.nextInt();
            int time1 = (day1 * DAYS) + (hour1 * HOURS) + (min1 * MINUTES) + sec1;
            int time2 = (day2 * DAYS) + (hour2 * HOURS) + (min2 * MINUTES) + sec2;
            int diff = time2 - time1;
            int day = diff / DAYS;
            int hourInSec = diff % DAYS;
            int hour = hourInSec / HOURS;
            int minInSec = diff % HOURS;
            int min = minInSec / MINUTES;
            int sec = diff % 60;
            System.out.print("(" + day + " " + hour + " " + min + " " + sec + ") ");
        }

    }



    public void method() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        long sum, sum1, sum2;
        long d11, h11, m11, s11;
        for (int i = 0; i < x; i++) {

            long d1 = input.nextLong();
            long h1 = input.nextLong();
            long m1 = input.nextLong();
            long s1 = input.nextLong();
            long d2 = input.nextLong();
            long h2 = input.nextLong();
            long m2 = input.nextLong();
            long s2 = input.nextLong();

            sum1 = s1 + m1 * 60 + h1 * 3600 + d1 * 3600 * 24;
            sum2 = s2 + m2 * 60 + h2 * 3600 + d2 * 3600 * 24;
            sum = sum2 - sum1;

            s11 = sum % 60;
            sum /= 60;
            m11 = sum % 60;
            sum /= 60;
            h11 = sum % 24;
            d11 = sum / 24;

            System.out.print("(" + d11 + " " + h11 + " " + m11 + " " + s11 + ") ");

        }

    }
}

