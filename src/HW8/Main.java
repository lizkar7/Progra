package HW8;
/*
Задача 1:
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен.
        Задача *:
Написать такой конструктор, который запретит создание объекта класса Dog в других
классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
способа.
*/

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Rodger", 1);
        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");

        Tiger tiger = new Tiger("Leo",4);
        tiger.voice();
        tiger.eat("Grass");

        Dog dog = Dog.createDog("Hakki", 3);
        dog.voice();
        dog.eat("Meat");

    }
}
