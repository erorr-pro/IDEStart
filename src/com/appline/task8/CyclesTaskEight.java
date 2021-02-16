package com.appline.task8;

import java.util.Scanner;

public class CyclesTaskEight {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getPositiveInt();
        checkResult(number);
    }

    private static void checkResult() {
    }


    private static int getPositiveInt() {
        System.out.println("Введите целое положительное число: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 0) {
                return number;
            } else {
                System.out.println("Ошибка!");
                scanner.nextLine();
                number = getPositiveInt();
            }
        } else {
            System.out.println("Ошибка!");
            scanner.nextLine();
            number = getPositiveInt();
        }
        return number;
    }

    private static void checkResult(int number) {
        int incNum;
        int resultSumNum = 0;
        for (incNum = 1; incNum <= number; incNum += 2) {
            System.out.print("   " + incNum);
            resultSumNum += incNum;
        }
        System.out.println("");
        System.out.println("Результат сложения всех не чётных чисел до введнного числа: " + resultSumNum);
    }

}
