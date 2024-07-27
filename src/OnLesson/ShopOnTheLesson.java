package OnLesson;

import java.util.Scanner;

public class ShopOnTheLesson {
    private static String items = "";

    public static void main(String[] args) {


        add(getName(), getPrice());
        add(getName(), getPrice());
        add("Сахар", 90);
        print("Содержимое корзины: ");
        clear();
        print("Содержимое:");
        thereIsAMethod time = new thereIsAMethod();
        System.out.println(time.getDay());
    }

    public static int getPrice () {
        System.out.println("Введите цену: ");
        int price = new Scanner(System.in).nextInt();
        return price;
    }

    public static String getName () {
        System.out.println("Введите наименование продукта: ");
        Scanner na = new Scanner(System.in);
        String name = na.nextLine();
        return name;
    }

    public static void add (String name, int price ) {
        items = items + " \n" + name + " - " + price;
    }

    public static void clear () {
        items = "";
    }

    public static void print (String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

}
