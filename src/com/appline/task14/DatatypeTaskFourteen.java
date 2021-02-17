package com.appline.task14;

import java.util.Arrays;

public class DatatypeTaskFourteen {

    public static void main(String[] args) {
        int a = -20; // Начальное значение диапазона
        int b = 20; // Конечное значение диапазона

        int[] lineMatrix = createLineMatrix(a, b);
        int minNum = minNumMatrix(lineMatrix);
        int maxNum = maxNumMatrix(lineMatrix);
        maxNumModulo(minNum, maxNum);
    }

    public static int[] createLineMatrix(int a, int b) {
        int[] lineMatrix = new int[15];
        for (int increment = 0; increment < 15; increment++) {
            lineMatrix[increment] = a + (int) (Math.random() * ((b - a) + 1)); // видя это тихо плачет питонист
            //System.out.println("Ввести " + increment + " элемент массива:  " + lineMatrix[increment]);
        }
        System.out.println("Массив: " + Arrays.toString(lineMatrix));
        return lineMatrix;
    }

    public static int minNumMatrix(int[] lineMatrix) {
        int minNum = lineMatrix[0] + 1;
        for (int matrix : lineMatrix) {
            if (matrix < minNum) {
                minNum = matrix;
            }
        }
        System.out.println("Минимальное число в массиве: " + minNum);
        return minNum;
    }

    public static int maxNumMatrix(int[] lineMatrix) {
        int maxNum = lineMatrix[0] + 1;
        for (int matrix : lineMatrix) {
            if (maxNum < matrix) {
                maxNum = matrix;
            }
        }
        System.out.println("Максимальное число в массиве: " + maxNum);
        return maxNum;
    }

    public static void maxNumModulo(int minNum, int maxNum) {
        int min = Math.abs(minNum);
        int max = Math.abs(maxNum);
        if (min == max){
            System.out.println("Числа " + minNum + " и " + maxNum + " равны по модулю");
        } else if (min < max){
            System.out.println("Число " + maxNum + " больше числа " + minNum + " по модулю");
        } else {
            System.out.println("Число " + maxNum + " меньше числа " + minNum + " по модулю");
        }
    }
}
