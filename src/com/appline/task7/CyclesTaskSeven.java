package com.appline.task7;

import java.util.Scanner;

public class CyclesTaskSeven {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // тут логика
        int arrayLength = getArrayLength();
        String[] arrayNumbs = fillingArray(arrayLength);
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

    private static String[] fillingArray(int arrayLength) {
        String[] arrayNumbs = new String[arrayLength];

        for (int increment = 0; increment < arrayLength; increment++) {
            System.out.println("Ввести элемент массива: " + increment);
            arrayNumbs[increment] = scanner.next(); // Заполняем массив элементами с клавиатуры
        }

        System.out.print("Массив arrayNumbs содержит элементы:");
        for (int increment = 0; increment < arrayLength; increment++) {
            System.out.print(" | " + arrayNumbs[increment]); // Печатаем полученный массив
        }
        System.out.println(" |");
        System.out.println("_____________________________________________");
        return arrayNumbs;
    }



}


//        do {
//            // тело цикла
//        } while (condition);

//        if (condition1) {
//    ...
//        } else if (condition2) {
//    ...
//        } else if (condition3) {
//    ...
//        } else if (condition4) {
//    ...
//        }


//    private static int getArrayLength() {
//        System.out.println("Введите длину массива: ");
//        int arrayLength;
//        if (scanner.hasNextInt()) { // истина если введённое число int
//            arrayLength = scanner.nextInt();
//            if (arrayLength > 0){
//                System.out.println("Длина массива: " + arrayLength);
//                return arrayLength;
//            } else {
//                System.out.println("Ошибка. Длина массива это целое положительное число.");
//                scanner.nextLine();
//                arrayLength = getArrayLength();
//            }
//        } else {
//            System.out.println("Ошибка. Длина массива это целое положительное число.");
//            scanner.next();
//            arrayLength = getArrayLength();
//        }
//        return arrayLength;
//    }