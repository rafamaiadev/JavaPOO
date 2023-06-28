package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Is there na initial deposit? (y/n)");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter a deposit value: ");
            double initialDeposit = scanner.nextDouble();
             contaBancaria = new ContaBancaria(number, name, initialDeposit);
        } else {
            contaBancaria = new ContaBancaria(number, name);
        }

        System.out.println("Account data: ");
        System.out.println(contaBancaria.toString());

        System.out.println("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        contaBancaria.makeDeposit(depositValue);
        System.out.println(contaBancaria.toString());

        System.out.println("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        contaBancaria.makeWithdraw(withdraw);
        System.out.println(contaBancaria.toString());

        scanner.close();
    }
}
