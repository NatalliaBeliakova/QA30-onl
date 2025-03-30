package homework_7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;

    }
    public Phone(){
        this.number = "+375290984765";
        this.model = "Samsung Galaxy S24";
        this.weight = 213;
    }

    public void displayData(){
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall (String userName){
        System.out.println("Звонит " + userName);
    }

    public void receiveCall (String userName, String userNumber) {
        System.out.println(userName + "Звонит с номера " + userNumber);
    }


    public void sendMessage(String... numbers){
        System.out.println("Сообщение отправлено на номера: ");
        for (String el : numbers) {
            System.out.println(el);
        }
    }

}
