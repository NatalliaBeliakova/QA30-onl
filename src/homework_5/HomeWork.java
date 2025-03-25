package homework_5;

import java.util.Scanner;



public class HomeWork {
    public static void main(String[] args){
        //getMultiArray();
        //makeChessBoard();
        getSumArray();
    }

    public static int [][][] createMultiArray(){
        int [][][] cube = new int [][][] {
                {
                        {1, 3, 5},
                        {8, 12}
                },
                {
                        {30, 2, 825}
                }
        };
        return cube;
    }

    public static void getMultiArray(){
        //Создать трехмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        // Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.


        int[][][] mas = createMultiArray();
        System.out.println("Установите значение для увеличения массива: ");
        int num = input().nextInt();

        for (int outer = 0; outer < mas.length; outer++ )
            for (int inner = 0; inner < mas[outer].length; inner++) {
                for (int deep = 0; deep < mas[outer][inner].length; deep++){
                    System.out.print(mas[outer][inner][deep]*num + " ");
                }
                System.out.println();
            }
        }


        public static void makeChessBoard() {
            //Шахматная доска
            // Создать программу для раскраски шахматной доски с помощью цикла.
            //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
            //циклам значения B(Black) или W(White). Результат работы программы:
            //W B W B W B W B
            //B W B W B W B W
            //W B W B W B W B
            //B W B W B W B W
            //W B W B W B W B
            //B W B W B W B W
            //W B W B W B W B
            //B W B W B W B W
            String[][] chessBoard = new String[8][8];
            System.out.println("Здесь вы увидете шахматную доску, каждая клетка которой окрашена буквами W или B.");
            for (int i = 0; i < chessBoard.length; i++) {
                for (int a = 0; a < chessBoard[i].length; a++) {
                    if ((i + a) % 2 == 0) chessBoard[i][a] = "W";
                    else chessBoard[i][a] = "B";
                    System.out.print(chessBoard[i][a] + "\t");
                }
                System.out.print("\n");

            }
        }

    public static void getSumArray() {
        //Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

        int[][] array = {
                {1, 1, 3},
                {1, 2, 1},
                {10, 3, 0}
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array.length; b++) {

                sum += array[i][b];
            }

        }
        System.out.println("Сумма элементов массива: " + sum);
    }




    public static Scanner input(){
        return new Scanner(System.in);
    }
}






