package com.appline.final1;

import java.util.Scanner;

public class finalOne {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float course = getCourse();
        float amountMoney = getAmountMoney();
        resultMoney(amountMoney, course);
    }



    private static float getCourse() {
        System.out.println("Курс доллара: ");
        float course;
        if (scanner.hasNextFloat()) {
            course = scanner.nextFloat();
            String courseCut = String.format("%.2f", course);
            System.out.println("Курс доллара: " + courseCut + " RUB");
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            course = getCourse();
        }
        return course;
    }

    private static float getAmountMoney() {
        System.out.println("Введите количество рублей: ");
        float amountMoney;
        if (scanner.hasNextFloat()) {
            amountMoney = scanner.nextFloat();
            String amountMoneyCut = String.format("%.2f", amountMoney);
            System.out.println("Количество рублей для обмена: " + amountMoneyCut);
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            amountMoney = getCourse();
        }
        return amountMoney;
    }

    private static void resultMoney(float course, float amountMoney) {
        float result = course / amountMoney ;
        System.out.println("Итого: " + result + " USD");
    }


//    Курс доллара: 67,55
//    Количество рублей: 1000
//    Итого: 14,80 долларов

}
