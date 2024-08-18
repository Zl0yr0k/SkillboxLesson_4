package OnLesson;

import java.util.Scanner;

public class ShopOnTheLesson {
    private  String items = "";
    private  int totalPrice;
    private  boolean commandOfExit = true;

   public void cycleOfGetNameAndGetPrice() {
       while (commandOfExit) {
           add(getName(), getPrice());
       }
   }

    public void add (String name, int price ) {

        items = items + " \n" + name + " - " + price;
        totalPrice = totalPrice + price;
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
