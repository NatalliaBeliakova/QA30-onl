package homework_7;

public class Main {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("+375445447470", "Xiaomi Redmi Note 14", 205);
        Phone phoneTwo = new Phone("+989878654321", "Lenovo K320T");
        Phone phoneThree = new Phone();

        phoneOne.displayData();
        phoneTwo.displayData();
        phoneThree.displayData();

        phoneOne.receiveCall("Лера");
        phoneTwo.receiveCall("Игорь ", "+375448598465");

        System.out.println("Номер телефона первого устройства: " + phoneOne.getNumber());
        System.out.println("Номер телефона второго устройства: " + phoneTwo.getNumber());
        System.out.println("Номер телефона третьего устройства: " + phoneThree.getNumber());

        phoneOne.sendMessage("+985764538862", "+375296073985", "+78990997543");
    }
}
