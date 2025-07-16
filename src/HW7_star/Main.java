package HW7_star;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args){
        Apple apple=new Apple();

        System.out.println("Color befor: ");
        apple.printColor();

        try{
            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "green");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("After: ");
        apple.printColor();


    }
}
