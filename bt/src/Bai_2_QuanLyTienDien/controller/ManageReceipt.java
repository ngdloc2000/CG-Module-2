package Bai_2_QuanLyTienDien.controller;

import Bai_2_QuanLyTienDien.model.Customer;
import Bai_2_QuanLyTienDien.model.Receipt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageReceipt {
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Receipt> receiptList = new ArrayList<>();

    // Hiển thị tất cả Khách hàng
    public void showAllCustomer() {
        ArrayList<Customer> customerList = readCustomerFromFile("D:\\Codegym\\Module_2\\bt\\src\\Bai_2_QuanLyTienDien\\customer.txt");
        for (Customer c : customerList
        ) {
            System.out.println(c);
        }
    }

    // Hiển thị tất cả biên lai
    public void showAllReceipt() {
        for (int i = 0; i < receiptList.size(); i++) {
            System.out.println(i + 1 + ". " + receiptList.get(i));
        }
    }

    // Tìm Khách hàng theo Số nhà
    public Customer searchCustomerByApartmentNumber(String apartmentNumber) {
        Customer customer = null;
        for (Customer c : customerList) {
            if (c.getApartmentNumber().equals(apartmentNumber)) {
                customer = c;
            }
        }
        return customer;
    }

    // Tìm Biên lai theo Mã biên lai
    public Receipt searchReceiptByIdReceipt(String idReceipt) {
        Receipt receipt = null;
        for (Receipt r : receiptList) {
            if (r.getIdReceipt().equals(idReceipt)) {
                receipt = r;
            }
        }
        return receipt;
    }

    // Nhập thông tin đối tượng khách hàng
    public Customer inputCustomer() {
        Scanner scannerString = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng: ");
        String name = scannerString.nextLine();
        System.out.print("Nhập số nhà: ");
        String apartmentNumber = scannerString.nextLine();
        System.out.print("Nhập mã số công tơ điện: ");
        String idElectricMeter = scannerString.nextLine();
        Customer customer = new Customer(name, apartmentNumber, idElectricMeter);
        return customer;
    }

    // Nhập thông tin đối tượng Biên lai
    public Receipt inputReceipt() {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.print("Nhập số nhà của hộ dân: ");
        String apartmentNumber = scannerString.nextLine();
        System.out.print("Nhập mã biên lai: ");
        String idReceipt = scannerString.nextLine();
        System.out.print("Nhập số cũ: ");
        int oldIndex = scannerInt.nextInt();
        System.out.print("Nhập số mới: ");
        int newIndex = scannerInt.nextInt();
        Receipt receipt = new Receipt(searchCustomerByApartmentNumber(apartmentNumber), idReceipt, oldIndex, newIndex);
        return receipt;
    }

    // Tính tiền điện theo Số nhà
    public int calculateAmountPaidByApartmentNumber(String apartmentNumber) {
        for (int i = 0; i < receiptList.size(); i++) {
            if (receiptList.get(i).getCustomer().getApartmentNumber().equals(apartmentNumber)) {
                return receiptList.get(i).calculateAmountPaid();
            }
        }
        return -1;
    }

    // Ghi File danh sách khách hàng
    public void writeCustomerListToFile(String path, ArrayList<Customer> customerList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customerList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc File danh sách khách hàng
    public ArrayList<Customer> readCustomerFromFile(String path) {
        ArrayList<Customer> customerList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            customerList = (ArrayList<Customer>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerList;
    }

    public ManageReceipt() {
    }

    public ManageReceipt(ArrayList<Customer> customerList, ArrayList<Receipt> receiptList) {
        this.customerList = customerList;
        this.receiptList = receiptList;
    }
}
