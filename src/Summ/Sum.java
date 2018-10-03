package Summ;

import java.util.Random;

public class Sum {

    public static void main(String[] args) {

         Random random1 = new Random();
        int num = random1.nextInt(10000);
        System.out.println(num);
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Сумма числа  = " + sum);

        int num1 = 23685914;
        int sum1 = 0;
        while (num1 % 10 != 5) {
            num1 = num1 / 10;
        }
        System.out.println(num1);
        while (num1 != 0) {
            sum1 = sum1 + num1 % 10;
            num1 = num1 / 10;
        }
        System.out.println("Сумма числа до цифры 5  = " + sum1);

        int number = 1215112;
        int pr = 1;
        while (number != 1) {
            pr = pr * (number % 10);
            number = number / 10;
        }
        System.out.println("Произведение числа  = " + pr);
    }
}