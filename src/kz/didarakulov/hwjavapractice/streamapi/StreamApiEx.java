package kz.didarakulov.hwjavapractice.streamapi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StreamApiEx {
    public static void main(String[] args) {
        // считываем строку с файла, делаем 2-3 преобразования и записываем в файл
        File fileToRead = new File("assets/textForTest.txt");
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(fileToRead)) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String stringForChange = sb.toString();
        System.out.println("Текст до преобразований: " + stringForChange);


        //    Удаление одинаковых символов
        String distinctChars = "";
        for (int i = 0; i < stringForChange.length(); i++) {
            if (!distinctChars.contains(String.valueOf(stringForChange.charAt(i)))) {
                distinctChars = distinctChars + stringForChange.charAt(i);
            }
        }
        stringForChange = stringForChange + "Удаление одинаковых символов: " + distinctChars;
        System.out.println("Удаление одинаковых символов: " + stringForChange);

//    Частота встречаемости символа в строке
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (Character ch : stringForChange.toCharArray()) {
            for (int i = 0; i < stringForChange.length(); i++) {
                if (stringForChange.charAt(i) == ch) {
                    Integer countCh = charFrequency.getOrDefault(ch, 0) + 1;
                    charFrequency.put(ch, countCh);
                }
            }
        }
        stringForChange = stringForChange + ". Частота встречаемости символа в строке: " + charFrequency;
        System.out.println("Частота встречаемости символа в строке: " + stringForChange);
//    Переворот строки
        StringBuilder revertString = new StringBuilder(stringForChange);
        String reverse = revertString.reverse().toString();
        stringForChange = stringForChange + "Переворот строки: " + reverse;
        System.out.println("Переворот строки: " + stringForChange);


        try (FileWriter fileToWrite = new FileWriter("assets/result.txt");) {
            fileToWrite.write(stringForChange);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
