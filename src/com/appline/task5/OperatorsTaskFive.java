package com.appline.task5;

import java.util.Scanner;

public class OperatorsTaskFive {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int numberOne = getInt();
        int numberTwo = getInt();
        char operation = getOperation();
        int result = count(numberOne, numberTwo, operation); // нужно добавить обработку деления на ноль
        System.out.println("Результат операции: " + result);
    }


    private static int getInt() {
        System.out.println("Введите число: ");
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


    private static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка. Введите операцию.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }


    private static int count(int numberOne, int numberTwo, char operation) {
        int result;
        switch (operation) { // выражение для сравнения
            case '-':
                result = numberOne - numberTwo;
                break;
            case '+':
                result = numberOne + numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            default:
                System.out.println("Ошибка. Введите операцию.");
                result = count(numberOne, numberTwo, getOperation());
        }
        return result;
    }

}