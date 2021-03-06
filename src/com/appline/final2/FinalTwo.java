package com.appline.final2;

import java.util.Scanner;

class FinalTwo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = takeStr();
        String operation = getOperation(str);
        calc(str, operation);
    }

    private static String takeStr() {
        System.out.println("Введите уравнение вида 'x+a=b': ");
        return scanner.next();
    }

    private static String getOperation(String str) {
        String operation;
        if (str.charAt(1) == '-') {
            operation = "-";
        } else {
            operation = "+";
        }
        return operation;
    }

    private static void calc(String str, String operation) {

        int firstNumber = Character.digit(str.charAt(0), 10);
        int secondNumber = Character.digit(str.charAt(2), 10);
        int thirdNumber = Character.digit(str.charAt(4), 10);

        if (str.charAt(0) == 'x' & operation.equals("-")) { //x-2=8
            System.out.println("x=" + (thirdNumber + secondNumber));
        } else if (str.charAt(0) == 'x' & operation.equals("+")) { //x+2=8
            System.out.println("x=" + (thirdNumber - secondNumber));
        } else if (str.charAt(2) == 'x' & operation.equals("-")) { //2-x=8
            System.out.println("x=" + (thirdNumber + firstNumber));
        } else if (str.charAt(2) == 'x' & operation.equals("+")) { //2+x=8
            System.out.println("x=" + (thirdNumber - firstNumber));
        } else if (str.charAt(4) == 'x' & operation.equals("-")) { //2-8=x
            System.out.println("x=" + (firstNumber - secondNumber));
        } else if (str.charAt(4) == 'x' & operation.equals("+")) { //2+8=x
            System.out.println("x=" + (firstNumber + secondNumber));
        } else {
            System.out.println("Проверьте ввод");
        }
    }
}

