package HW9_2;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя                                                                           абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
*/

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(5);
        figures[1] = new Circle(2);
        figures[2] = new Rectangel(8.2, 0.5);
        figures[3] = new Triangle(4, 5, 6);
        figures[4] = new Triangle(7, 8, 9);

        double totalPer = 0;

        for (Figure f : figures) {
            totalPer += f.getPerimeter();
        }

        System.out.println("Sum all peremeters: " + totalPer);
    }
}
