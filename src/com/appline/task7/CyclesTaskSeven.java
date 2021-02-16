package com.appline.task7;

import java.util.Scanner;

public class CyclesTaskSeven {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String x = "3";
        String y = "dfr";
        String z = "33";
        System.out.println("Значение X = " + x);
        System.out.println("Значение Y = " + y);
        System.out.println("Значение Z = " + z);
        int arrayLength = getArrayLength();
        String[] arrayNumbs = fillingArray(arrayLength);
        checkArray(arrayNumbs, x, y, z);
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

    private static void checkArray(String[] arrayNumbs, String x, String y, String z) {
        for (String arrayNumb : arrayNumbs) {
            if (arrayNumb.equals(x)) {
                System.out.println("Данное значение имеется в константах: " + arrayNumb);
            } else if (arrayNumb.equals(y)) {
                System.out.println("Данное значение имеется в константах: " + arrayNumb);
            } else if (arrayNumb.equals(z)) {
                System.out.println("Данное значение имеется в константах: " + arrayNumb);
            } else {
                System.out.print("");
            }

        }
    }
}




