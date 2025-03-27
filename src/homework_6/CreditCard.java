package homework_6;

public class CreditCard {
    public long accountNumber;
    public double accountBalance;

    public CreditCard(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.accountBalance = balance;
    }

    public void depositMoney(double amount) {
        accountBalance += amount;
        System.out.println("Поступление на счёт " + amount + ". Новый баланс карты " + accountNumber + ": " + accountBalance);

    }

    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Со счёта " + accountNumber + " списано " + amount + ". Новый баланс: " + accountBalance);
            } else {
                System.out.println("Недостаточно средств. Баланс: " + accountBalance);
            }
        } else{
                System.out.println("Сумма списания должна быть > 0");
            }
        }

    public void cardInfo(){
        System.out.println("Счёт " + accountNumber + " Баланас: " + accountBalance);
    }
    }
