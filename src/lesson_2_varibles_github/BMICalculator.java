package lesson_2_varibles_github;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        startBMI();
    }

    public static void startBMI(){
        getInitialMsg();
        getBMIData();
    }

    public static void getInitialMsg() {
        System.out.println("***************************INSTRUCTIONS******************************");
        System.out.println("Добро пожаловать в калькулятор по вычислению индекса вашего тела.");
        System.out.println("Этот калькулятор покажет, соответствует ли ваш вес вашему росту\nи нужно ли вам " +
                "задуматься нам диетой или же поднабрать вес.");
        System.out.println("*********************************************************************");
    }

    // Для того, чтобы можно было вводить с клавиатуры данные мы используем класс SCANNER
    public static void getBMIData(){
        // Будем запрашивать данные пользователя
        // Scanner это самый простой способ получить данные с клавиатуры
        // Это класс и нужно создать его экземпляр
        // Создание любого объект происходит через ключевое слово new
        // new выделяет память для класса/объекта
        // System.in -> это указание компилятору, что данные в Сканнер придут с клавиатуры
        Scanner input = new Scanner(System.in);

        System.out.print("Пожалуйста, введите свой вес в КГ: ");
        double weight = input.nextDouble(); // input это имя экземпляра класса/объекта Scanner
        // Сканнер у нас знает, что мы будет давать ему данные через клавиатуры
        // . это обращение ко внутренностям класса/объекта; input. -> дает возможность обратиться к методам класса
        // Сканнер. Среди методов есть получение полной строки или данных с определенными уже типами
        // nextDouble() ждем данные типа double, nextInt, nextShort, nextLine() -> принимает целую строчку полностью
        // Строчка может быть любого типа, даже если вы ведете 56, А, 15.4

        System.out.print("Пожалуйста, введите свой рост в СМ: ");
        double height = input.nextDouble();

        calculateBMI(weight, height);
    }

    public static void calculateBMI(double weight, double height){
        height /= 100;
        double indexBMI = weight/(height * height);

        getBMIIndexMsg(indexBMI);
    }

    public static void getBMIIndexMsg(double indexBMI){
        // Java есть специальный математический класс Math
        // Он позволяет использовать базовые математические операции
        // Округление, квадрат и т.д.
        // Math.round() от Math.floor() 82, 172 = 28
        // Math.floor(indexBMI) - 82, 172 = 27.0
        System.out.println("Your BMI is: " + indexBMI);
        // Math.pow() - возведение в степень
        // Math.radon() - получение псевдослучайных числ
    }
}

