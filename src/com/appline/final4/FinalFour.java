package com.appline.final4;

import java.util.Scanner;

public class FinalFour {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Кто это?");
        test();
    }

    private static void test() {
        int tryNum = 0;
        boolean isNotPromptUsed = true;
        while (tryNum < 3) {
            System.out.println("Введите ответ " + (tryNum + 1) + ": ");
            String answer = scanner.nextLine();

            if ("Подсказка".equalsIgnoreCase(answer)) {
// (tryNum==0 && isNotPromptUsed) добавить если пользователь имеет право на подсказку только при первой попытке
                if (isNotPromptUsed) {
                    System.out.println("Какая-то подсказка");
                    isNotPromptUsed = false;
                } else {
                    System.out.println("Подсказка не доступна");
                }
                continue;
            }
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
            tryNum++;
        }
        if (tryNum == 3) {
            System.out.println("Обидно, приходи в другой раз!");
        }
    }
}