package HW9;

/*
Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.
*/

public class Main {
    public static void main(String[] args) {
        Position d = new Director();
        Position w = new Worker();
        Position a = new Accountant();

        d.printPosition();
        w.printPosition();
        a.printPosition();
    }
}
