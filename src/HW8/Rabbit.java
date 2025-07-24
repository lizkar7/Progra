package HW8;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Rabbit " + name + " says: f-f-f-f");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Rabbit " + name + " is happy");
        } else {
            System.out.println("Rabbit " + name + " doesn't like " + food);
        }
    }
}
