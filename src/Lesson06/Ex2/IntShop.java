package Lesson06.Ex2; //Корзина оналйн магазина. Реализованы следующие методы:


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntShop implements Basket {
    private ArrayList<Product> products = new ArrayList<>();

    @Override //Добавление продукта - addProduct
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
    }

    @Override //Удаление продукта - removeProduct
    public void removeProduct(String product) {
        Iterator<Product> proditer = products.iterator();
        while (proditer.hasNext()) {
            Product nextProd = proditer.next();
            if (nextProd.product.equals(product)) {
                proditer.remove();
            }
        }
    }

    @Override //Увеличение кол-ва товара - updateProductQuantity
    public void updateProductQuantity(String product, int quantity) {
        for (Product s : products) {
            if (s.product.equals(product)) {
                s.quantity = s.quantity + quantity;
            }
        }
    }

    @Override //Удаление списка продуктов - clear
    public void clear() {
        products.clear();
    }

    @Override //Получение списка продуктов - getProducts
    public List<String> getProducts() {
        List<String> arr = new ArrayList();
        for (Product s : products
        ) {
            arr.add(s.getProduct());
        }
        return arr;
    }

    @Override //получение кол-ва товара - getProducts
    public int getProductQuantity(String product) {
        int count = 0;
        for (Product s : products
        ) {
            if (s.product.equals(product)) {
                count = s.getQuantity();
            }
        }
        return count;
    }

    public static class Product {
        private String product;
        private int quantity;

        Product(String product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "product='" + product + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }

        public int getQuantity() {
            return quantity;
        }

        public String getProduct() {
            return product;
        }
    }

    public static void main(String[] args) {
        IntShop intShop = new IntShop();
        intShop.addProduct("Phone", 1);
        intShop.addProduct("Headphones", 2);
        intShop.addProduct("Case", 5);
        for (Product s: intShop.products
             ) {
            System.out.println(s.getProduct()+s.getQuantity());
        }
        intShop.removeProduct("Phone");
        intShop.updateProductQuantity("Headphones", 2);
        System.out.println(intShop.getProducts());
        System.out.println(intShop.getProductQuantity("Headphones"));
        intShop.clear();
        System.out.println(intShop.products);
    }
}
