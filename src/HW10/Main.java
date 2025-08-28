package HW10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        /*
        User user1 = new User(1,"Mari", "mari@mail.com");
        User user2 = new User(1,"Mari", "mari@mail.com");

        System.out.println(user1.equals(user2));
        System.out.println(user1);

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        System.out.println("Размер множества: "+ users.size());
        System.out.println("Элементы множества: "+ users);
        // тк хэши совпадают, выз. equals и тут они равны поэту записывается один объект
        */

        // Task 2*
        User user1 = new User(1, "Mari", "mari@mail.com");
        User user2 = new User(2, "Ann", "ann@mail.com");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип клонирования в виде цифры (1.поверхностное/2.глубокое)");
        int type = scanner.nextInt();
        if (type < 1 || type > 2) {
            System.out.println("Нет такого варианта, попробуйте еще.");
            return;
        }

        System.out.println("Введите id пользователя для клонирования: ");
        int id = scanner.nextInt();

        User orig = null;
        for (User u : users) {
            if (u.getId() == id) {
                orig = u;
                break;
            }
        }

        if (orig == null) {
            System.out.println("Пользователь с таким  id не найден.");
            return;
        }

        User clone = null;
        try {
            if (type == 1) {
                clone = (User) orig.clone();
            } else {
                clone = orig.deepClone();
            }
        } catch (CloneNotSupportedException cl) {
            cl.printStackTrace();
        }

        System.out.println("Оригинал: " + orig);
        System.out.println("Клон: " + clone);
        System.out.println("Сравнение ссылок: " + (orig == clone));
        System.out.println("Сравнение equals: "+ orig.equals(clone));
        scanner.close();


    }
}
