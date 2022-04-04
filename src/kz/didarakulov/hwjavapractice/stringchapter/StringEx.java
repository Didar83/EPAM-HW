package kz.didarakulov.hwjavapractice.stringchapter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input string: ");
//        String inputString = scanner.next();
//        scanner.close();
        String inputString = "This";
        Pattern pattern3 = Pattern.compile(inputString);
        Matcher matcher3 = pattern3.matcher(testString);
        Integer counter3 = 0;
        while (matcher3.find()) {
            counter3++;
        }
        System.out.println("Количество вхождений подстроки в строку: " + counter3);

//    Вывести слова строки в обратном порядке
        String[] stringArray = testString.split(" ");
        StringBuilder sbForAppend = new StringBuilder();
        StringBuilder sbForReverse;
        for (int i = 0; i < stringArray.length; i++) {
            sbForReverse = new StringBuilder(stringArray[i]);
            sbForAppend.append(sbForReverse.reverse() + " ");
        }
        System.out.println("Вывести слова строки в обратном порядке: " + sbForAppend.toString());

//    Сортировка массива строк по алфавиту
        List<String> sortedStringArray = Arrays.stream(stringArray).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println(sortedStringArray);
//    Определить длину самого короткого слова в строке
        int shortestString = Arrays.stream(stringArray).mapToInt(s -> s.length()).min().orElse(-1);
        System.out.println("Определить длину самого короткого слова в строке: " + shortestString);
//    Подсчет количества слов в строке
        Integer counter4 = testString.split("\\W+").length;
        System.out.println("Подсчет количества слов в строке: " + counter4);
//    Добавление пробелов в строку


//    Является ли строка палиндром?


//    Замена подстроки в строке


//    Расстояние между подстроками


    }
}
