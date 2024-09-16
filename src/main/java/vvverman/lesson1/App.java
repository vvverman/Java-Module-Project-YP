package vvverman.lesson1;

import vvverman.lesson1.entity.Product;
import vvverman.lesson1.services.CalculatorService;
import vvverman.lesson1.services.FormatorService;
import vvverman.lesson1.services.ProductService;

import java.util.List;


public class App {

    public static void main(final String[] args) {
        List<Product> products = ProductService.getProducts();
        double invoice = ProductService.getSumProducts(products);
        double sumForPersons = CalculatorService.getSumForPersons(invoice);
        System.out.println(FormatorService.getRubleAddition(sumForPersons));


    }
}
