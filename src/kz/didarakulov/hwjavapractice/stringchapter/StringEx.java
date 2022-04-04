package kz.didarakulov.hwjavapractice.stringchapter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEx {
    public static void main(String[] args) {

        String testString = "This is string. Is this string long enough? String starts with index = 0. Some numbers for this string: 123 456 789 000.";
//    Четные и нечетные символы разделить по разным строкам
        StringBuilder oddSymbols = new StringBuilder();
        StringBuilder evenSymbols = new StringBuilder();
        for (int i = 0; i < testString.length(); i++) {
            if (i % 2 == 0) {
                evenSymbols.append(testString.charAt(i));
            } else {
                oddSymbols.append(testString.charAt(i));
            }
        }
        System.out.println("Нечетные символы строки: " + oddSymbols);
        System.out.println("Четные символы строки: " + evenSymbols);
//    Количество цифр в строке
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(testString);
        Integer counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Количество цифр в строке: " + counter);
//    Вводится строка из букв и цифр, построить новую только из цифр
        StringBuilder onlyNumbers = new StringBuilder();
        Matcher matcher2 = pattern.matcher(testString);
        int group = 0;
        while (matcher2.find()) {
            onlyNumbers.append(matcher2.group(group));
        }
        System.out.println("Вводится строка из букв и цифр, построить новую только из цифр: " + onlyNumbers);
//    Удаление одинаковых символов
        Set<Character> distinctSymbols = new HashSet<>();
        char[] chars = testString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            distinctSymbols.add(Character.valueOf(chars[i]));
        }
        System.out.println("Удаление одинаковых символов: " + distinctSymbols);

//    Частота встречаемости символа в строке
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (Character ch : distinctSymbols) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    Integer countCh = charFrequency.getOrDefault(ch, 0) + 1;
                    charFrequency.put(ch, countCh);
                }
            }
        }
        System.out.println("Частота встречаемости символа в строке: " + charFrequency);
//    Переворот строки
        StringBuilder revertString = new StringBuilder(testString);
        String reverse = revertString.reverse().toString();
        System.out.println("Переворот строки: " + reverse);
//    Количество вхождений подстроки в строку


//    Вывести слова строки в обратном порядке


//    Сортировка массива строк по алфавиту


//    Определить длину самого короткого слова в строке


//    Подсчет количества слов в строке


//    Добавление пробелов в строку


//    Является ли строка палиндром?


//    Замена подстроки в строке


//    Расстояние между подстроками
    }
}
