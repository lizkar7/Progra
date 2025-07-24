package HW8;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Animal sound");
    }

    public void eat(String food) {
        System.out.println(name + "eats" + food);
    }
}
