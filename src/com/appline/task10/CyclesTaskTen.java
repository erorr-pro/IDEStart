package com.appline.task10;

import java.util.Scanner;

public class CyclesTaskTen {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfColumns = getNumberOfColumns();
        int numberOfLines = getNumberOfLines();
        int[][] numbsMatrix = fillingMatrix(numberOfColumns, numberOfLines);
    }

    private static int getNumberOfColumns() {
        System.out.println("Введите количество столбцов матрицы: ");
        int numberOfColumns;
        if (scanner.hasNextInt()) {
            numberOfColumns = scanner.nextInt();
            if (numberOfColumns > 0) {
                return numberOfColumns;
            } else {
                System.out.println("Ошибка!");
                scanner.nextLine();
                numberOfColumns = getNumberOfColumns();
            }
        } else {
            System.out.println("Ошибка!");
            scanner.nextLine();
            numberOfColumns = getNumberOfColumns();
        }
        return numberOfColumns;
    }

    private static int getNumberOfLines() {
        System.out.println("Введите количество строк матрицы: ");
        int numberOfLines;
        if (scanner.hasNextInt()) {
            numberOfLines = scanner.nextInt();
            if (numberOfLines > 0) {
                return numberOfLines;
            } else {
                System.out.println("Ошибка!");
                scanner.nextLine();
                numberOfLines = getNumberOfLines();
            }
        } else {
            System.out.println("Ошибка!");
            scanner.nextLine();
            numberOfLines = getNumberOfLines();
        }
        return numberOfLines;
    }

    private static int[][] fillingMatrix(int numberOfColumns, int numberOfLines) {
        int[][] numbsMatrix = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < numberOfLines; i++){  // идём по строкам
            for (int j = 0; j < numberOfColumns;  j++){  // идём по столбцам
                System.out.print(" " + numbsMatrix[i][j] + " ");  // вывод элемента
            }
            System.out.println(); // перенос строки ради визуального сохранения табличной формы
        }
        return numbsMatrix;
    }

}
