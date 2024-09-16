package vvverman.lesson1.services;

import vvverman.lesson1.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

    public static List<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        boolean whileCondition = false;
        while (!whileCondition) {
            Scanner scanner = new Scanner(System.in);
            Product product = new Product();
            System.out.println("Введите имя товара");
            product.setName(scanner.nextLine());

            System.out.println("Введите цену товара");
            product.setPrice(scanner.nextDouble());

            products.add(product);
            System.out.println("Напишите \"завершить\", чтобы завершить");

            String command = scanner.next();
            whileCondition = command.equalsIgnoreCase("завершить");


        }

        System.out.println("Добавленные товары:\n ");
        for (Product product : products) {
            System.out.println(product.toString());

        }
        System.out.println("Общая сумма товаров: " + getSumProducts(products));
        return products;
    }

    public static double getSumProducts(List<Product> products) {
        double count = 0.0;
        for (Product product : products) {
            count = count + product.getPrice();
        }

        return count;
    }
}
