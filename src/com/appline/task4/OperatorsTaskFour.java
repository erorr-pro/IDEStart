package com.appline.task4;

import java.util.Scanner;

public class OperatorsTaskFour {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите числа X, Y, Z:");
        int numberX = getInt();
        int numberY = getInt();
        int numberZ = getInt();
        float arithmeticMean = arithmeticMean(numberX, numberY, numberZ);
        float finalResult = wholePartOfDivisionArithmeticMean(arithmeticMean);
        printResult(finalResult);
    }


    private static int getInt() {
        System.out.println("Ввод числа:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            number = getInt();
        }
        return number;
    }


    private static float arithmeticMean(float numberX, float numberY, float numberZ) {
        float arithmeticMean = (numberX + numberY + numberZ) / 3;
        System.out.println("Среднее арифметическое значение чисел X, Y, Z = " + arithmeticMean);
        return arithmeticMean;
    }


    private static float wholePartOfDivisionArithmeticMean(float arithmeticMean) {
        float finalResult = (arithmeticMean / 2);
        System.out.println("Целая часть среднего арифметического (делёного на 2) = " + Math.floor(finalResult));
        return finalResult;
    }


    private static void printResult(float finalResult) {
        if (finalResult > 3) {
            System.out.println("Программа выполнена корректно. Полученное число больше 3.");
        } else {
            System.out.println("Полученное число меньше 3.");
        }
    }

}