package com.appline.task10;

import java.util.Arrays;
import java.util.Scanner;

public class CyclesTaskTen {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfColumns = getNumberOfColumns();
        int numberOfLines = getNumberOfLines();
        int[][] numbsMatrix = printMatrix(numberOfColumns, numberOfLines);
        //int[][] numbsMatrixFull = fillingMatrix(numberOfColumns, numberOfLines);
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

    private static int[][] printMatrix(int numberOfColumns, int numberOfLines) {
        int[][] numbsMatrix = new int[numberOfLines][numberOfColumns];
        for (int i = 0; i < numberOfLines; i++){  // идём по строкам
            for (int j = 0; j < numberOfColumns;  j++){  // идём по столбцам
                System.out.println("Введите элемент " + "i_"+ i + " " + "j_" + j);
                numbsMatrix[i][j] = scanner.nextInt();
            }
            System.out.println(); // перенос строки ради визуального сохранения табличной формы
        }
        System.out.print(Arrays.deepToString(numbsMatrix));
        return numbsMatrix;
    }

    private static int[][] fillingMatrix(int numberOfColumns, int numberOfLines){
        int[][] numbsMatrixFull = new int[numberOfLines][numberOfColumns];
        for (int i = 0; i < numbsMatrixFull.length; i++) {
            for (int j = 0; j < numbsMatrixFull[i].length; j++) {
                numbsMatrixFull[i][j]=j+1;
            }
        }
        for (int[] anArr : numbsMatrixFull) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        return numbsMatrixFull;

    }



}
