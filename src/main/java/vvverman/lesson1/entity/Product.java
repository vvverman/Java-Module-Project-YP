package vvverman.lesson1.entity;

import java.util.Objects;

public class Product {
   String name;
   double price;

   @Override
   public String toString() {
      return "Product{" +
              "name='" + name + '\'' +
              ", price=" + price +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Product product = (Product) o;
      return Double.compare(product.price, price) == 0 && name.equals(product.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, price);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
