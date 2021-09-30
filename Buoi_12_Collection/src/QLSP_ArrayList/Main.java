package QLSP_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P1", "Kẹo", 20000);
        Product product2 = new Product("P2", "Mứt", 50000);
        Product product3 = new Product("P3", "Bánh", 30000);
        Product product4 = new Product("P4", "Bim bim", 10000);

        ArrayList<Product> productList = new ArrayList<>();

        ProductManagement productManagement = new ProductManagement(productList);
        productManagement.addProduct(product1);
        productManagement.addProduct(product2);
        productManagement.addProduct(product3);
        productManagement.addProduct(product4);

//        productManagement.priceDecreaseProduct();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Nhập ID cần sửa: ");
        String idInput = scanner.nextLine();
        System.out.println("Nhập ID mới: ");
        String idNew = scanner.nextLine();
        System.out.println("Nhập tên mới: ");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập giá mới: ");
        double priceNew = scanner1.nextDouble();

        productManagement.editProduct(idInput, idNew, nameNew, priceNew);
        productManagement.showAllProduct();
    }
}
