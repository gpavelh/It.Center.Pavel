package Lesson06.Ex2;


import java.util.ArrayList;
import java.util.List;

public class IntShop implements Basket{
    List<Product> prod = new ArrayList();
    @Override
    public void addProduct(String product, int quantity) {
        prod.add(new Product(product,quantity));
    }

    @Override
    public void removeProduct(String product) {
        prod.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product s: prod) {
            if (s.product.equals(product)){
                s.quantity = s.quantity + quantity;
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i <prod.size() ; i++) {
            prod.remove(i);
        }
    }

    @Override
    public List<String> getProducts() {
        List<String> arr = new ArrayList();
        for (int i = 0; i <= prod.size() ; i++) {
            arr.set(i, String.valueOf(prod.get(i)));
        }
        return arr;
    }

    @Override
    public int getProductQuantity(String product) {
        int a = 0;
        for (Product s: prod
             ) {
            if (s.product.equals(product)){
                a = s.getQuantity();
            }
        }
        return a;
    }
    public static class Product{
        String product;
        int quantity;

        Product(String product, int quantity){
            this.product = product;
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {

    }


}
