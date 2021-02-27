package com.appline.final3;

import java.util.*;

public class FinalTree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLine = getNumberOfLine();

        List<String> strings = getLine(numberOfLine);
        System.out.println("Введённые строки: " + strings);

        List<Integer> allSymbols = verifyLine(strings, numberOfLine);
        System.out.println("Количество символов во всех строках: " + allSymbols);

        compareAndPrintString(strings, allSymbols);
    }

    private static int getNumberOfLine() {
        System.out.println("Введите количество строк: ");
        int numberOfLine;
        if (scanner.hasNextInt()) {
            numberOfLine = scanner.nextInt();
            if (numberOfLine > 0) {
                return numberOfLine;
            } else {
                System.out.println("Ошибка! Введите целое положительное число.");
                scanner.next();
                numberOfLine = getNumberOfLine();
            }
        } else {
            System.out.println("Ошибка! Введите целое положительное число.");
            scanner.next();
            numberOfLine = getNumberOfLine();
        }
        return numberOfLine;
    }


    public static List<String> getLine(int numberOfLine) {
        List<String> strings = new ArrayList<>();
        int i;
        for (i = numberOfLine - (numberOfLine - 1); i <= numberOfLine; i++) {
            System.out.println("Введите строку " + (numberOfLine - (numberOfLine - i)));
            String strLine = scanner.next(); // разделяет по пробелу
            strings.add(strLine);
        }
        return strings;
    }

    public static List<Integer> verifyLine(List<String> strings, int numberOfLine) {
        List<Integer> allSymbols = new ArrayList<>();
        int i;
        for (i = numberOfLine - (numberOfLine - 1); i <= numberOfLine; i++) {
            int count = (int) strings.get(i - 1).chars().distinct().count(); //chars() codePoints()
            allSymbols.add(count);
        }
        return allSymbols;
    }

    public static void compareAndPrintString(List<String> strings, List<Integer> allSymbols) {
        int maxSymbols = Collections.max(allSymbols);
        System.out.println("Максимальное количество символов: " + maxSymbols);

        List<Integer> resultNumberSymbols = new ArrayList<>();
        for (int i = 0; i <= allSymbols.size() - 1; i++) {

            if (maxSymbols == allSymbols.get(i)) {
                resultNumberSymbols.add(i);
            }
        }
        System.out.println("Ответ: " + strings.get(resultNumberSymbols.get(0)));
    }
}
