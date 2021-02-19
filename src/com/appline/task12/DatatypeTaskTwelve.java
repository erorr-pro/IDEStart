package com.appline.task12;

public class DatatypeTaskTwelve {
    static String stopWord = "I like Java!!!";

    public static void main(String[] args) {

        boolean isJavaWordContains = stopWord.contains("Java");
        if (isJavaWordContains){
            System.out.println("Строка содержит 'Java'");
        } else {
            System.out.println("Строка НЕ содержит 'Java'");
        }

        boolean isILikeWordsStartsWith = stopWord.startsWith("I like");
        if (isILikeWordsStartsWith){
            System.out.println("Строка начинается с 'I like'");
        } else {
            System.out.println("Строка НЕ начинается с 'I like'");
        }

        boolean isWordEndWith = stopWord.endsWith("!!!");
        if (isWordEndWith){
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка НЕ заканчивается на '!!!'");
        }

        if (isJavaWordContains & isILikeWordsStartsWith & isWordEndWith) {
            System.out.println(stopWord.toUpperCase()); // выводим строку если 3 условия истины
        }

        // Замена всех символов ‘a’ на ‘о’ и вывод подстроки “Jovo”
        System.out.println(stopWord.replace("a","o").substring(7,11));

    }
}
