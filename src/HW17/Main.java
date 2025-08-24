package HW17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*Задача 1:
        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        когда пользователю исполнится 100 лет. Использовать Date/Time API.
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождение в формате дд.мм.гг: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthd = LocalDate.parse(input, formatter);
        LocalDate plusCentury = birthd.plusYears(100);
        System.out.println("Вам исполниться 100 лет в " + plusCentury);
        */

        /* Задача 2
        Используя Predicate среди массива чисел вывести только те,
        которые являются положительными.*/

        /*Integer[] numbers = {1, 2, 3, -5, 6, -7};
        System.out.println("Первоначальный массив: "+ numbers);
        Predicate<Integer> isPlus = n -> n > 0;
        for (Integer num : numbers) {
            if (isPlus.test(num)) {
                System.out.print(num + " ");
            }
        }
        */

        /*Задача 3:
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в BYN: ");
        String summ = scanner.nextLine();

        Function<String, Double> newSumm = s -> {
            String[] parts = summ.split(" ");  // массив строк
            double byn = Double.valueOf(parts[0]);
            double usd = 3.1;
            return byn / usd;
        };

        System.out.println("Сумма в USD: " + String.format("%.2f", newSumm.apply(summ)));
        scanner.close();
        */
        /*Задача 4:
        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        выводить сумму, переведенную сразу в доллары.
           */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в BYN: ");
        String summ = scanner.nextLine();

        Consumer<String> consumer = s->{
            String[] parts = s.split(" ");  // массив строк
            double byn = Double.parseDouble(parts[0]);
            double usd = 3.1;
            double result = byn / usd;
            System.out.println("Сумма в USD:" + String.format("%.2f", result));
        };
        consumer.accept(summ);
        scanner.close();
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        Supplier<String> reverseSupplier = () -> {
            return new StringBuilder(input).reverse().toString();
        };

        System.out.println("Задом наперед: " + reverseSupplier.get());
        scanner.close();

    }
}
