package com.appline.final3;

import java.util.*;

public class FinalTree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLine = getNumberOfLine();

        List<String> strings = getLine(numberOfLine);
        System.out.println("strings: " + strings);

        List<Integer> countSymbols = verifyLine(strings, numberOfLine);
        System.out.println("countSymbols" + countSymbols);

        compareAndPrintString(strings, countSymbols, numberOfLine);


        //verifyLine(List<String> strings);
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
            String strLine = scanner.nextLine(); // разделяет по пробелу
            strings.add(strLine);
        }
        return strings;
    }

    public static List<Integer> verifyLine(List<String> strings, int numberOfLine) {
        List<Integer> countSymbols = new ArrayList<>();
        int i;
        for (i = numberOfLine - (numberOfLine - 1); i <= numberOfLine; i++) {
            int count = (int) strings.get(i-1).chars().distinct().count(); //chars() codePoints()
            countSymbols.add(count);
        }
        return countSymbols;
    }

    public static void compareAndPrintString(List<String> strings, List<Integer> countSymbols, int numberOfLine) {
        int max = Collections.max(countSymbols);
        System.out.println("Максимальное количество символов в строке: " + max);
        //System.out.println(strings.get(max));

    }



}
