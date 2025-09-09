package Lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        // 1.вернуть все цифры из строки:
        System.out.println("Строка: \n" + str1);
        System.out.println("Все цифры из строки: ");
        Pattern numPattent = Pattern.compile("\\d+");
        Matcher numMatcher = numPattent.matcher(str1);
        while (numMatcher.find()) {
            System.out.println(numMatcher.group());
        }

        // 2.заменить КАЖДУЮ букву на знак &
        System.out.println("Буквы заменены на &: ");
        String replacedLetters = str1.replaceAll("[A-Za-zА-Яа-я]", "&");
        System.out.println(replacedLetters);

        //3.
        System.out.println("Инста:");
        Pattern instaPattern = Pattern.compile("@\\w+");
        Matcher instaMatcher = instaPattern.matcher(str1);
        if (instaMatcher.find()) {
            System.out.println(instaMatcher.group());
        }

        //4. "null"
        System.out.println("Проверка строки 'null' ");
        String nullString = "null";
        System.out.println(nullString.matches("null"));

        //5.
        String str2 = "Hello \n world \n !!!";
        System.out.println("Удаление символов \\n:");
        Pattern newLinePattern = Pattern.compile("\\\\n");
        Matcher newLineMatcher = newLinePattern.matcher(str2);
        String removedNewLines = newLineMatcher.replaceAll("");
        System.out.println(removedNewLines);

        //6.
        String str3 = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        System.out.println("Имя и фамилия:");
        Pattern namePattern = Pattern.compile("[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+");
        Matcher nameMatcher = namePattern.matcher(str3);
        if (nameMatcher.find()) {
            System.out.println(nameMatcher.group());
        }


    }
}

