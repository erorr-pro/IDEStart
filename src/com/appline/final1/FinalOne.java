package com.appline.final1;

import java.util.Scanner;

public class FinalOne {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double courseCut = getCourse();
        double amountMoneyCut = getAmountMoney();
        resultMoney(amountMoneyCut, courseCut);
    }

    private static double getCourse() {
        System.out.println("Курс доллара: ");
        double course;
        if (scanner.hasNextDouble()) {
            course = scanner.nextDouble();
            course = course * 100;
            course = (double) Math.round(course);
            course = course / 100;
            String courseCut = String.format("%.2f", course);
            System.out.println("Курс доллара: " + courseCut + " RUB");
            return course;
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            return getCourse();
        }
    }

    private static double getAmountMoney() {
        System.out.println("Введите количество рублей: ");
        double amountMoney;
        if (scanner.hasNextDouble()) {
            amountMoney = scanner.nextDouble();
            amountMoney = amountMoney * 100;
            amountMoney = (double) Math.round(amountMoney);
            amountMoney = amountMoney / 100;
            String amountMoneyCut = String.format("%.2f", amountMoney);
            System.out.println("Количество рублей для обмена: " + amountMoneyCut);
            return amountMoney;
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            return getAmountMoney();
        }
    }

    private static void resultMoney(double course, double amountMoney) {
        double result = course / amountMoney;
        System.out.println("Итого: " + String.format("%.2f", result) + " USD");
    }
}
