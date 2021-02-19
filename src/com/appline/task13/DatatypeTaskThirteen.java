package com.appline.task13;

import java.util.Scanner;


public class DatatypeTaskThirteen<count> {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String stopWord = getstopWord();
        checkLatinWord(stopWord);
    }

    private static String getstopWord() {
        System.out.println("Введите фразу: ");
        String stopWord = null;
        if (scanner.hasNext()) {
            stopWord = scanner.nextLine();
            System.out.println("Вы ввели фразу: " + stopWord);
        }
        return stopWord;
    }

    private static void checkLatinWord(String stopWord) {
        String filterInput = stopWord.replaceAll("[^A-Za-z]", "");

        String delSpace = filterInput.replaceAll("\\s+", " ");
        System.out.println("Все 'латинские' слова: " + delSpace);

        String[] filterAllKirill = delSpace.split(" ");
        System.out.println("Количество 'латинских' слов: " + filterAllKirill.length);
    }
}
