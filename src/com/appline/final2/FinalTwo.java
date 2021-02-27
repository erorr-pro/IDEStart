package com.appline.final2;

import java.util.Scanner;

class FinalTwo {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //double x = scanner.nextDouble();

        System.out.println("Программа решает уравнение вида 'x+a=b': ");
        System.out.print("Введите число 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Введите число 'b': ");
        double b = scanner.nextDouble();
        double x = -b + a;
        System.out.println("Решение уравнения x + " + a + " = " + b + ";");
        System.out.println("x = " + x);
    }
}


//    public static void main(String[] args) {
//        System.out.println("Введите уравнение вида 'x + a = b': ");
//        System.out.print("Введите число 'a': ");
//        double a = scanner.nextDouble();
//        System.out.print("Введите число 'b': ");
//        double b = scanner.nextDouble();
//        double x = -b / a;
//        System.out.println("Решение уравнения x + " + a + " = " + b + ";");
//        System.out.println("x = " + x);
//    }
