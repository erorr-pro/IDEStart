package com.appline.task13;

import java.util.Arrays;
import java.util.Scanner;


public class DatatypeTaskThirteen {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String stopWord = getStopWord();
        checkLatinWord(stopWord);
    }

    private static String getStopWord() {
        System.out.println("Введите фразу: ");
        String stopWord = null;
        if (scanner.hasNext()) {
            stopWord = scanner.nextLine();
            System.out.println("Вы ввели фразу: " + stopWord);
        }
        return stopWord;
    }

    private static void checkLatinWord(String stopWord) {


        String delSpace = stopWord.replaceAll("\\p{Punct}","")
                .replaceAll("\\s+", " ")
                .replaceAll("[-]","");
        System.out.println("Все слова без лишних знаков: " + delSpace);

        String filterInput = delSpace.replaceAll("[а-яА-Я0-9]", "");
        System.out.println("Все латинские слова: " + filterInput);

        String[] filterAllKirill = filterInput.split("\\s+");
        System.out.println("Массив 'латинских' слов: " + Arrays.toString(filterAllKirill));
        System.out.println("Количество 'латинских' слов: " + filterAllKirill.length);
    }
}
