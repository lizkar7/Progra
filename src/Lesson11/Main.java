package Lesson11;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        // 1.1 сложение строк (+,.concat())
        String result1 = str1 + " " + str2;
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("сложение сторок " + result1);
        System.out.println("сложение сторок" + result2);

        // 1.2 проверка строк на равенство (.equals())
        boolean result3 = str1.equals(str2); //проверка с учётом регистра
        boolean result4 = str1.equalsIgnoreCase(str2); // проверка без учёта регистра
        System.out.println("проверка строк на равенство " + result3);
        System.out.println("проверка строк на равенство " + result4);

        // 1.3 вернуть подстроку с 3-го символа до конца
        String result5 = str1.substring(2);
        System.out.println("вернуть подстроку с 3-го символа до конца " + result5);

        // 1.4 вывести длину строки
        System.out.println("длина строки: " + str1.length());

        // 1.5 вывести порядковый номер любого символа в строке
        int index = str1.indexOf('o');
        System.out.println("порядковый номер символа 'o': " + index);

        // 1.6 преобразовать логический тип true к строке
        String boolStr = String.valueOf(true);
        System.out.println("boolean в строку: " + boolStr);

        // 1.7 перевести строку в верхний регистр
        System.out.println("верхний регистр: " + str1.toUpperCase());

        // 1.8 заменить ‘1’ в строке на ‘%’
        System.out.println("замена 1 на %: " + str1.replace('1', '%'));

        // 1.9 убрать все пробелы в строке с двух сторон
        System.out.println("1.9 Trim: '" + str1.trim() + "'");

        // 1.10 Проверить, пустая ли строка
        System.out.println("1.10 Пустая ли строка: " + str1.isEmpty());

        // 1.11 Разбить строку на несколько по делителю
        String[] parts = str1.split("1");
        System.out.println("1.11 Разбить по '1': ");
        for (String p : parts) {
            System.out.println(p);
        }


        // 2.1 Создать объект StringBuilder с любой строкой
        StringBuilder sb = new StringBuilder("Hello");

        // 2.2 Добавить к строке “xxxx”
        sb.append("xxxx");
        System.out.println("2.2 После append: " + sb);

        // 2.3 В 5-ю позицию вставить “y”
        sb.insert(4, "y"); // индексация с 0
        System.out.println("2.3 После insert: " + sb);

        // 2.4 Удалить символы с 3 по 6
        sb.delete(2, 6); // (включительно 2, исключая 6)
        System.out.println("2.4 После delete: " + sb);

        // 2.5 Перевернуть строку
        sb.reverse();
        System.out.println("2.5 reverse: " + sb);

        // 2.6 Преобразовать в String и вывести в консоль
        String result = sb.toString();
        System.out.println("2.6 Преобразованная строка: " + result);
    }
}



