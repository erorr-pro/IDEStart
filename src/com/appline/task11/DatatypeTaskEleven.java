package com.appline.task11;

import java.util.Scanner;

public class DatatypeTaskEleven {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberInt = getInt();
        Double numberDouble = getStr();
        String numberDoubleStr = Double.toString(numberDouble);
        compareResultOutput(numberInt, numberDoubleStr);
    }

    private static int getInt() {
        System.out.println("Введите целое число: ");
        int numberInt;
        if (scanner.hasNextInt()) {
            numberInt = scanner.nextInt();
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            numberInt = getInt();
        }
        return numberInt;
    }

    private static Double getStr() {
        System.out.println("Введите дробное число: ");
        Double numberDouble;
        if (scanner.hasNextDouble()) { // фильтр чисел типа double
            numberDouble = scanner.nextDouble();
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            numberDouble = getStr();
        }
        return numberDouble;
    }

    private static void compareResultOutput(int numberInt, String numberDoubleStr) {

        double numberDouble = Double.parseDouble(numberDoubleStr); // приводим строку к double
        if (numberInt == numberDouble) {
            System.out.println("Числа равны!");
        } else if (numberInt < numberDouble) {
            System.out.println("Наибольшее число " + numberDouble);
            System.out.println("Наименьшее число " + (double) numberInt);
        } else if (numberInt > numberDouble) {
            System.out.println("Наибольшее число " + (double) numberInt);
            System.out.println("Наименьшее число " + numberDouble); // заведомо double
        } else {
            System.out.println("Непредвиденная ошибка!");
        }
    }

}
