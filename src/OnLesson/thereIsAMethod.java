package OnLesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class thereIsAMethod {

    LocalDateTime timenowformethod;
    LocalDate dateNow;
    int addDaysFor;

    public void main(String[] args) {
        System.out.println("Текущее время и дата :" + LocalDateTime.now());
        System.out.println("Текущее время и дата :" + timeNowFor());
        System.out.println("Сегодня дата:" + LocalDate.now());
        System.out.println("Текущая дата" + getDay());



        System.out.println("Введите число дней: ");
        addDaysFor = new Scanner(System.in).nextInt();
        System.out.println("Получим дату"+addDay(addDaysFor));

        System.out.println("ВВедите сколько дней надо добавить: ");
        int addDateFor = new Scanner(System.in).nextInt();
        System.out.println("Введите сколько часов добавить :");
        int addHourFor = new Scanner(System.in).nextInt();
        System.out.println("Введите сколько минут добавить");
        int addMinutesFor = new Scanner(System.in).nextInt();
        System.out.println(addDay(addDateFor,addHourFor,addMinutesFor));


        while (true) {
            addDay();
        }




    }

    public  LocalDateTime timeNowFor() {
        return timenowformethod = LocalDateTime.now();
    }

    public  LocalDate getDay() {
        return dateNow = LocalDate.now();
    }

    public  void addDay () {
        System.out.println("Введите число дней: ");
        addDaysFor = new Scanner(System.in).nextInt();
        System.out.println( "Через "+addDaysFor+" дней дата будет " +LocalDate.now().plusDays(addDaysFor));
    }

    public  LocalDate addDay (int addDaysFor) {
        return  LocalDate.now().plusDays(addDaysFor);
    }

    public  LocalDateTime addDay (int addDaysFor, int addHourFor, int addMinuteFor) {
        LocalDateTime timeNow = LocalDateTime.now();

        timeNow =  LocalDateTime.from(timeNow).plusDays(addDaysFor);

        timeNow = LocalDateTime.from(timeNow).plusHours(addHourFor);

        timeNow = LocalDateTime.from(timeNow).plusMinutes(addMinuteFor);
        return timeNow;


    }

}
