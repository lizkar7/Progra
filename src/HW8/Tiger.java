package HW8;

public class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Tiger " + name + " says: r-r-r-r-r");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Tiger " + name + " is happy");
        } else {
            System.out.println("Tiger " + name + " doesn't like " + food);
        }
    }
}
