package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //foundArrayNumber();
        //createArray();
        //generateRandomArray();
        //getTwoArrays();
        //sortArray();
        replaceArray();
    }

    public static void foundArrayNumber() {
        //Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner).
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Введите число для поиска: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + target + " найдено в массиве");
        } else {
            System.out.println("Число " + target + " не найдено в массиве");
        }
        scanner.close();
    }

    public static void createArray() {
        //Создайте массив целых чисел. Удалите все вхождения заданного
        //числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        //выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{1, 4, 3, 5, 6, 8, 7, 9};
        System.out.println("Пожалуйста, введите целое число для удаления его из массива: ");
        int del = scanner.nextInt();
        int counter = 0;
        for (int el : array) {
            if (el != del) {
                counter++;
            }
        }

        if (counter == array.length) {
            System.out.println("Число " + del + " не найдено в массиве.");
            scanner.close();
            return;
        }
        int[] newArray = new int[counter];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != del) {
                newArray[j++] = array[i];
            }
        }

        System.out.println("\nВаш новый массив: ");
        for (int el : newArray) {
            System.out.print(el + "\t");
        }
        scanner.close();

    }

    public static void generateRandomArray() {
        //Создайте и заполните массив случайным числами и выведете
        //максимальное, минимальное и среднее значение.
        //Для генерации случайного числа используйте метод Math.random().
        //Пусть будет возможность создавать массив произвольного размера.
        //Пусть размер массива вводится с консоли.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        double average;
        double sum = 0;
        double min = array[0];
        double max = array[0];

        for (double numb : array) {
            if (numb < min) {
                min = numb;
            }
            if (numb > max) {
                max = numb;
            }
            sum += numb;
        }
        average = sum / size;
        System.out.println("Среднее значение = " + average);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);

        scanner.close();
    }

    public static void getTwoArrays() {
        //Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        //Посчитайте среднее арифметическое элементов каждого массива и
        //сообщите, для какого из массивов это значение оказалось больше (либо
        //сообщите, что их средние арифметические равны).
        int[] arrayOne = new int[]{4, 56, 87, 10, 25};
        System.out.print("Первый массив: ");
        for (int el : arrayOne) {
            System.out.print(el + "\t");
        }
        int[] arrayTwo = new int[]{25, 45, 23, 1, 13};
        System.out.print("\nВторой массив: ");
        for (int el : arrayTwo) {
            System.out.print(el + "\t");
        }
        double averageArrayOne, averageArrayTwo;
        double sum1 = 0;
        double sum2 = 0;
        for (int a : arrayOne) {
            sum1 += a;
        }
        averageArrayOne = sum1 / arrayOne.length;
        for (int b : arrayTwo) {
            sum2 += b;
        }
        averageArrayTwo = sum2 / arrayTwo.length;
        if (averageArrayOne > averageArrayTwo) {
            System.out.println("\nСреднее арифметичсеское элементов первого массива больше, чем среднее арифметическое элементов второго массива");
        } else if (averageArrayOne < averageArrayTwo) {
            System.out.println("\nСреднее арифметичсеское элементов первого массива меньше, чем среднее арифметическое элементов второго массива");
        } else  {
            System.out.println("\\nСреднее арифметичсеское элементов первого массива равно среднему арифметичскому элементов второго массива");
        }

        }
        public static void sortArray() {
            //Создайте массив строк. Заполните его произвольными именам
            // людей.
            //Отсортируйте массив.
            //Результат выведите на консоль.
        String[] array = new String[] {"Lera", "Natali", "Elena", "Irina", "Andrew", "Igor"};
        Arrays.sort(array);
        for (String name : array) {
            System.out.println(name);
        }
        }

    public static void replaceArray() {
        //Создайте массив и заполните массив.
        //Выведите массив на экран в строку.
        //Замените каждый элемент с нечётным индексом на ноль.
        //Снова выведете массив на экран на отдельной строке.
        int[] array = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2== 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    }








