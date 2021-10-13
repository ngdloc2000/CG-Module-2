package Bai_2_QuanLyTienDien.view;

import Bai_2_QuanLyTienDien.controller.ManageReceipt;
import Bai_2_QuanLyTienDien.model.Customer;
import Bai_2_QuanLyTienDien.model.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Receipt> receiptList = new ArrayList<>();
        
        ManageReceipt manageReceipt = new ManageReceipt(customerList, receiptList);
        String customerFilePath = "D:\\Codegym\\Module_2\\bt\\src\\Bai_2_QuanLyTienDien\\customer.txt";
        Scanner scannerInt = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("------------------------------");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TIỀN ĐIỆN");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Thêm biên lai");
            System.out.println("3. Hiển thị tất cả khách hàng");
            System.out.println("4. Hiển thị tất cả biên lai");
            System.out.println("5. Tính tiền điện theo số nhà");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scannerInt.nextInt();

            switch (choice) {
                case 1:
                    Customer customer = manageReceipt.inputCustomer();
                    customerList.add(customer);
                    manageReceipt.writeCustomerListToFile(customerFilePath, customerList);
                    break;
                case 2:
                    Receipt receipt = manageReceipt.inputReceipt();
                    receiptList.add(receipt);
                    break;
                case 3:
                    manageReceipt.showAllCustomer();
                    break;
                case 4:
                    manageReceipt.showAllReceipt();
                    break;
                case 5:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Nhập số nhà: ");
                    String apartmentNumber = scanner.nextLine();
                    System.out.println("Số tiền điện mà số nhà " + apartmentNumber + " phải trả là: " + manageReceipt.calculateAmountPaidByApartmentNumber(apartmentNumber));
                    break;
                case 0:
                    manageReceipt.writeCustomerListToFile("D:\\Codegym\\Module_2\\bt\\src\\Bai_2_QuanLyTienDien\\customer.txt", customerList);
                    System.exit(0);
            }
        }
    }
}
