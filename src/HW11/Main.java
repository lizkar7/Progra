package HW11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите 3 строки через enter: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        // task 1
        String max = str1;
        String min = str2;

        if (str2.length() > max.length()) {
            max = str2;
        }

        if (str3.length() > max.length()) {
            max = str3;
        }
        if (str2.length() < min.length()) {
            min = str2;
        }

        if (str3.length() < min.length()) {
            min = str3;
        }
        System.out.println("1.Самая длинная строка: " + max + "\n Длина: " + max.length());
        System.out.println("1.Самая короткая строка строка: " + min + "\n Длина: " + min.length());

        // task 2
        String[] arr = {str1, str2, str3};
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("2.Строки в порядке возрастания длины: ");
        for (String s : arr) {
            System.out.println(s + " длина " + s.length());
        }

        // task 3
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        double avg = (len1 + len2 + len3) / 3.0;

        System.out.println("3.Средняя длина: " + avg);
        System.out.println("Строки, длина которых меньше средней: ");
        if (len1 < avg) {
            System.out.println(str1 + " длина: " + len1);
        }
        if (len2 < avg) {
            System.out.println(str2 + " длина: " + len2);
        }
        if (len3 < avg) {
            System.out.println(str3 + " длина: " + len3);
        }

        // task 4
        String[] allWorld = (str1+ " "+ str2 +" "+ str3).split(" ");

        String result = null;
        for (String word : allWorld){
            if (hasAllUniqueChars(word)){
                result = word;
                break;
            }
        }
        if (result!= null){
            System.out.println("4.Первое слово с уникальным символом: "+ result);
        } else {
            System.out.println("4.Слово с уникальным символом нет ");
        }

        // task 5
        System.out.println("Введите новую строку: ");
        String str5 = scanner.nextLine();

        StringBuilder result2 = new StringBuilder();// класс для создания или изменения строк

        for(char c : str5.toCharArray()){
            result2.append(c).append(c);
        }
        System.out.println("Результат удвоения: "+ result2);
    }
    private static boolean hasAllUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false; // нашли повтор
                }
            }
        }
        return true;
    }
}
