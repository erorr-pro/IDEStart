package com.appline.task6;

import java.util.Scanner;

public class OperatorsTaskFSix {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int convertibleValue = getConvertibleValue();
        int unit = choice(convertibleValue);
        float numberOfUnits = getNumberOfUnits();
        converter(convertibleValue, unit, numberOfUnits);
    }


    private static int getConvertibleValue() {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int convertibleValue = scanner.nextInt();
        switch (convertibleValue) { // выражение для сравнения
            case 1:
                System.out.println("Вы выбрали: 1 - масса");
                break;
            case 2:
                System.out.println("Вы выбрали: 2 - расстояние");
                break;
            default:
                System.out.println("Ошибка! Введите нужное число!");
        }
        return convertibleValue; // 1 или 2
    }

    private static int choice(int convertibleValue) {
        if (convertibleValue == 1){
            return getUnitWeight();
        } else {
            return unitDistance();
        }
    }

    private static int getUnitWeight() {
        System.out.println("Выберите единицу измерения: 1 - киллограм, 2 - фунт");
        int unitWeight = scanner.nextInt();
        switch (unitWeight) { // выражение для сравнения
            case 1:
                System.out.println("Вы выбрали 1 - киллограм");
                break;
            case 2:
                System.out.println("Вы выбрали 2 - фунт");
                break;
            default:
                System.out.println("Ошибка. Введите допустимое число.");
        }
        return unitWeight;
    }

    private static int unitDistance() {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unitDistance = scanner.nextInt();
        switch (unitDistance) { // выражение для сравнения
            case 1:
                System.out.println("Вы выбрали 1 - километр");
                break;
            case 2:
                System.out.println("Вы выбрали 2 - миля");
                break;
            case 3:
                System.out.println("Вы выбрали 3 - ярд");
                break;
            case 4:
                System.out.println("Вы выбрали 4 - фут");
                break;
            default:
                System.out.println("Ошибка. Введите допустимое число.");
                scanner.next();
                unitDistance = scanner.nextInt();
        }
        return unitDistance;
    }


    private static float getNumberOfUnits() {
        System.out.println("Введите число (например '3,5'): ");
        float numberOfUnits;
        if (scanner.hasNextFloat()) {
            numberOfUnits = scanner.nextFloat();
        } else {
            System.out.println("Ошибка. Введите число.");
            scanner.next();
            numberOfUnits = getNumberOfUnits();
        }
        return numberOfUnits;
    }

    private static void converter(int convertibleValue, int unit, float numberOfUnits) {
        if (convertibleValue == 1 & unit == 1) {
            System.out.println("Результат: " + numberOfUnits + " кг равно " + numberOfUnits * 2.2 + " фунта");
        } else if (convertibleValue == 1 & unit == 2) {
            System.out.println("Результат: " + numberOfUnits + " фунта равно " + numberOfUnits * 0.454 + " кг");
        } else if (convertibleValue == 2 & unit == 1) {
            System.out.println("Результат: " + numberOfUnits + " км равно "
                    + "\n" + numberOfUnits * 0.62137 + " мили"
                    + "\n" + numberOfUnits * 1093.61 + " ярда"
                    + "\n" + numberOfUnits * 3280.84 + " футов");
        } else if (convertibleValue == 2 & unit == 2) {
            System.out.println("Результат: " + numberOfUnits + " мили равно "
                    + "\n" + numberOfUnits * 1.60934 + " км"
                    + "\n" + numberOfUnits * 1760 + " ярда"
                    + "\n" + numberOfUnits * 5280 + " футов");
        } else if (convertibleValue == 2 & unit == 3) {
            System.out.println("Результат: " + numberOfUnits + " ярда равно "
                    + "\n" + numberOfUnits * 0.0009144 + " км"
                    + "\n" + numberOfUnits * 0.0005681 + " мили"
                    + "\n" + numberOfUnits  * 3 + " футов");
        }else if (convertibleValue == 2 & unit == 4) {
            System.out.println("Результат: " + numberOfUnits + " фута равно "
                    + "\n" + numberOfUnits * 0.0003048+ " км"
                    + "\n" + numberOfUnits * 0.00018939+ " мили"
                    + "\n" + numberOfUnits * 0.3333333 + " ярда");
        } else {
            System.out.println("Непредвиденная ошибка!");
        }
    }

}