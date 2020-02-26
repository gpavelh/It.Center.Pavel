package Lesson06.Ex2;

import java.util.ArrayList;
import java.util.List;

public class IntShop implements Basket {
    private List<Product> products = new ArrayList();

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product s : products) {
            if (s.product.equals(product)) {
                s.quantity = s.quantity + quantity;
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> arr = new ArrayList();
        for (Product s : products
        ) {
            arr.add(s.getProduct());
        }
        return arr;
    }

    @Override
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

        public int getQuantity() {
            return quantity;
        }

        public String getProduct() {
            return product;
        }
    }

    public static void main(String[] args) {

    }


}
