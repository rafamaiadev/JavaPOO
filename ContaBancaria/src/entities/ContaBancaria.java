package entities;

public class ContaBancaria {
    private int number;
    private String name;
    private double balance;


    public ContaBancaria(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public ContaBancaria(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        makeDeposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void makeDeposit(double deposit) {
        this.balance += deposit;
    }

    public void makeWithdraw(double withdraw) {
        this.balance -= withdraw + 5;
    }


    @Override
    public String toString() {
        return "Account: " + number + ", name: " + name + ", balance: " + balance;
    }
}
