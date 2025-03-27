package homework_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        //Добавьте метод, который позволяет начислять сумму на кредитную
        //карточку.
        //Добавьте метод, который позволяет снимать с карточки некоторую
        //сумму.
        //Добавьте метод, который выводит текущую информацию о карточке.
        //Напишите программу, которая создает три объекта класса CreditCard у
        //которых заданы номер счета и начальная сумма
        //Тестовый сценарий для проверки:
        //Положите деньги на первые две карточки и снимите с третьей.
        //Выведите на экран текущее состояние всех трех карточек.

        CreditCard cardOne = new CreditCard(2345_8890_5678_4354L, 1000);
        CreditCard cardTwo = new CreditCard(1212_3232_4343_3434L, 1000);
        CreditCard cardThree = new CreditCard(3233_6475_7574_9008L, 1000);

        System.out.println("Поступление денег на первый счёт: ");
        long cardOneinput = input().nextLong();
        System.out.println("Поступление денег на второй счёт: ");
        long cardTwoinput = input().nextLong();
        System.out.println("Снятие денег с третьего счёта: ");
        long cardThreeinput = input().nextLong();

        cardOne.depositMoney(cardOneinput);
        cardTwo.depositMoney(cardTwoinput);
        cardThree.withdrawMoney(cardThreeinput);
    }
    public static Scanner input () {
        return new Scanner(System.in);
    }
}
