package OnLesson;

public class Main {


    public static void main(String[] args) {
        ShopOnTheLesson UdginBasket = new ShopOnTheLesson();
        UdginBasket.cycleOfGetNameAndGetPrice();
        System.out.println(UdginBasket.getTotalPrice());
        UdginBasket.printTotalPrice();
        System.out.println();
        UdginBasket.print("Содержимое корзины: ");
        UdginBasket.clear();
        UdginBasket.print("Содержимое:");
        thereIsAMethod time = new thereIsAMethod();
        System.out.println(time.getDay());

        ShopOnTheLesson OlgaBasket = new ShopOnTheLesson();
        OlgaBasket.cycleOfGetNameAndGetPrice();
    }
    }



