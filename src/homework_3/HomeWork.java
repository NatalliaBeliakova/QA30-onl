package homework_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String name = input().nextLine();
        //getSeasonOfYearSwitch();
        //getSeasonOfYearIf();
        //getTemperature ();
        //getEvenOrOdd();
        //getColors();
        //getOddNumbers();
        //getNumbers();
        //calculateSumOfNumbers();
        //getSequence();
        //getNumbersOfSequence();
        getSquares();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void getSeasonOfYearSwitch() {
        //Написать программу для вывода названия поры года по номеру
        //месяца.
        //При решении используйте оператор switch-case.
        System.out.println("Введите номер месяца от 1 до 12: ");
        int month = input().nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("Сезон года - зима.");
                break;
            case 3, 4, 5:
                System.out.println("Сезон года - весна.");
                break;
            case 6, 7, 8:
                System.out.println("Сезон года - лето.");
                break;
            case 9, 10, 11:
                System.out.println("Сезон года - осень.");
                break;
            default:
                System.out.println("Произошла ошибка. Введите число от 1 до 12.");
        }
    }

    public static void getSeasonOfYearIf() {
        //Написать программу для вывода названия поры года по номеру
        //месяца.
        //При решении используйте оператор if-else-if.
        System.out.println("Введите номер месяца от 1 до 12: ");
        int month = input().nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Сезон года - зима.");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Сезон года - весна.");
        } else if (month > 5 && month <= 8) {
            System.out.println("Сезон года - лето.");
        } else if (month > 8 && month <= 11) {
            System.out.println("Сезон года - осень.");
        } else {
            System.out.println("Введены некорректные данные.");
        }

    }

    public static void getTemperature() {
        //Для введенного числа t (температура на улице) вывести
        //Если t>–5, то вывести «Тепло».
        //Если –5>= t > –20, то вывести «Нормально».
        //Если –20>= t, то вывести «Холодно».
        System.out.println("Введите температуру на улице: ");
        int temp = input().nextInt();

        if (temp > -5) {
            System.out.println("Тепло");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("Нормально");
        } else if (temp <= -20) {
            System.out.println("Холодно");
        }
    }

    public static void getEvenOrOdd() {
        //Напишите программу, которая будет принимать на вход число и на
        //выход будет выводить сообщение четное число или нет.
        //Для определения четности числа используйте операцию получения
        //остатка от деления - операция выглядит так: '% 2').
        System.out.print("Введите число: ");
        int num = input().nextInt();

        if ((num % 2) > 0) {
            System.out.println("Число нечетное.");
        } else {
            System.out.println("Число четное.");
        }
    }

    public static void getColors() {
        //По введенному номеру определить цвет радуги (1 –
        //красный, 4 – зеленый и т. д.).
        System.out.print("Введите число от 1 до 7 для определения цвета радуги: ");
        int num = input().nextInt();

        switch (num) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зелёный");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Ввеедён некорректный номер.");

        }
    }

    public static void getOddNumbers() {
        //При помощи цикла for вывести на экран нечетные числа от 1 до 99
        //При решении используйте операцию инкремента (++).
        System.out.println("Нечетные числа от 1 до 99: ");
        for (int number = 1; number <= 99; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void getNumbers() {
        //Необходимо вывести на экран числа от 5 до 1
        //При решении используйте операцию декремента (--).
        for (int number = 5; number >= 1; number--) {
            System.out.println(number);
        }
    }

    public static void calculateSumOfNumbers() {
        //Напишите программу, где пользователь вводит любое целое
        //положительное число. А программа суммирует все числа от 1 до
        //введенного пользователем числа.
        //Для ввода числа воспользуйтесь классом Scanner.
        System.out.print("Введите число: ");
        int num = input().nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел до " + num + " равна " + sum);

    }

    public static void getSequence() {
        //Необходимо, чтоб программа выводила на экран вот такую
        //последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        //В решении используйте цикл while.
        int i = 7;
        while (i <= 98) {
            System.out.println(i);
            i += 7;
        }
    }

    public static void getNumbersOfSequence() {
        //Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        int num = 0;
        int times = 10;
        for (int i = 0; i < times; i++) {
            System.out.println(num);
            num -= 5;
        }
    }

    public static void getSquares() {
        //Составьте программу, выводящую на экран квадраты чисел от 10 до
        //20 включительно.
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println(square);
        }
    }
}


