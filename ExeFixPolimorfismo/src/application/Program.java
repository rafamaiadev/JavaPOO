package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        List<Product> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.print("Common, used, or imported (c/u/i)? ");
            char tag = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (tag == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));

            } else if (tag == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String inputDate = sc.next();
                LocalDate date = LocalDate.parse(inputDate, fmt1);

                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
