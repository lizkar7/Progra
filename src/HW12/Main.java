package HW12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[\\p{Lu}]{2,6}\\b",Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        while (matcher.find()){
            System.out.println("НАйденные аббревиатуры: "+matcher.group());
            found = true;
        }if(!found){
            System.out.println("Аббревиатур в строке нет");
        }

        // task *
        System.out.println("\n Введите строку с почтой, " +
                "документа в формате:\n" +
                "xxxx-xxxx-xx, где x - это любая цифра; " +
                "номер телефона в формате: +(xx)xxxxxxx: ");
        String input2 = scanner.nextLine();
        Pattern dokPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher dokMatcher = dokPattern.matcher(input2);
        while (dokMatcher.find()){
            System.out.println("Номер документа: "+ dokMatcher.group());
        }

        Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        Matcher emailMatcher = emailPattern.matcher(input2);
        while (emailMatcher.find()){
            System.out.println("Email: "+ emailMatcher.group());
        }

        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(input2);
        while (phoneMatcher.find()){
            System.out.println("Телефон: "+ phoneMatcher.group());
        }

        scanner.close();
    }
}
