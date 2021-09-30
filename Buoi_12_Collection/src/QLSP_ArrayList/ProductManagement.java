package QLSP_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManagement {
    ArrayList<Product> productList;

    public ProductManagement(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void showAllProduct() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + "." + " " + productList.get(i));
        }
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
    }

    public void editProduct(String idInput, String idNew, String nameNew, double priceNew) {
        for (Product product : productList) {
            if (product.getId().equals(idInput)) {
                System.out.println(9);
                product.setId(idNew);
                product.setName(nameNew);
                product.setPrice(priceNew);
            }
        }
    }

    public void searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName() == name) {
                System.out.println(productList.get(i));
            }
        }
    }

    public void priceIncreaseProduct() {
        PriceIncreaseComparator priceIncreaseComparator = new PriceIncreaseComparator();
        Collections.sort(productList, priceIncreaseComparator);
    }

    public void priceDecreaseProduct() {
        PriceDecreaseComparator priceDecreaseComparator = new PriceDecreaseComparator();
        Collections.sort(productList, priceDecreaseComparator);
    }
}
