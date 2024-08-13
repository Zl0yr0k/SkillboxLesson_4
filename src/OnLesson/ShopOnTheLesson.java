package OnLesson;

import java.util.Scanner;

public class ShopOnTheLesson {
    private static String items = "";
    private static int totalPrice;
    private static boolean commandOfExit = true;


    public static void main(String[] args) {

        while (commandOfExit) {
            add(getName(), getPrice());
            }


        System.out.println(getTotalPrice());
        printTotalPrice();
        System.out.println();
        print("Содержимое корзины: ");
        clear();
        print("Содержимое:");
        thereIsAMethod time = new thereIsAMethod();
        System.out.println(time.getDay());
    }

    public static void add (String name, int price ) {

        items = items + " \n" + name + " - " + price;
        totalPrice = totalPrice + price;
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
        if (name.equals("exit") ){
            commandOfExit = false;
        }

        return name;
    }


    public static void printTotalPrice () {
        System.out.println(totalPrice);
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void clear () {
        items = "";
        totalPrice = 0;
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
