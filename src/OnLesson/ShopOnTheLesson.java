package OnLesson;

import java.util.Scanner;

public class ShopOnTheLesson {
    private  String items = "";
    private  int totalPrice;
    private  boolean commandOfExit = true;

    public ShopOnTheLesson() {
        System.out.println("Список товаров");
    }
    public ShopOnTheLesson (int time, int timeNow) {
        this();
        if (time > timeNow) {
            clear();
            return;
        }
    }

   public void cycleOfGetNameAndGetPrice() {
       while (commandOfExit) {
           add(getName(), getPrice());
       }
   }

    public void add (String name, int price ) {
        add(name, price, 1);

    }
    public  void add (String name, int price, int count) {
        add(name,price,count,1);
    }

    public void add (String name, int price, int count, int time) {
        items = items + " \n" + name + " - " + count + " - " + price + " - " + time;
        totalPrice = totalPrice + count * price;
    }

    public int getPrice () {
        System.out.println("Введите цену: ");
        int price = new Scanner(System.in).nextInt();
        return price;
    }

    public String getName () {
        System.out.println("Введите наименование продукта: ");
        Scanner na = new Scanner(System.in);
        String name = na.nextLine();
        if (name.equals("exit") ){
            commandOfExit = false;
        }

        return name;
    }


    public void printTotalPrice () {
        System.out.println(totalPrice);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void clear () {
        items = "";
        totalPrice = 0;
    }

    public void print (String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

}
