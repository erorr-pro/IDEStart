package com.appline.task9;

import java.util.Scanner;

public class CyclesTaskNine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arrayLength = getArrayLength();
        double[] arrayNumbs = fillingArray(arrayLength);
        arithmeticMeanArray(arrayNumbs);
    }

    private static int getArrayLength() {
        int arrayLength;
        do {
            System.out.println("Ввести длину массива: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);
        System.out.println("Длина массива: " + arrayLength);
        return arrayLength;
    }

    private static double[] fillingArray(int arrayLength) {
        double[] arrayNumbs = new double[arrayLength];

        for (int increment = 0; increment < arrayLength; increment++) {
            System.out.println("Ввести элемент массива: " + increment);
            arrayNumbs[increment] = scanner.nextDouble(); // Заполняем массив (дробные числа через запятую)
        }
        return arrayNumbs;
    }

    private static void arithmeticMeanArray(double[] arrayNumbs) {
        double arithmeticSum = 0;
        for (double arrayNumb : arrayNumbs) {
            arithmeticSum += arrayNumb;
        }
        System.out.println("arithmeticMean " + arithmeticSum);
        System.out.println("Среднее арифметическое " + arithmeticSum / arrayNumbs.length);
    }

}
