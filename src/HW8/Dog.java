package HW8;

public class Dog extends Animal {

    private Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Dog " + name + " says: gaf-gaf");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Dog " + name + " is happy");
        } else {
            System.out.println("Dog " + name + " doesn't like " + food);
        }
    }

    public static Dog createDog(String name, int age) {
        return new Dog(name, age);
    }
}
