package Bai_2_QuanLyTienDien.model;

import java.io.Serializable;

public class Receipt implements Serializable {
    private Customer customer;
    private String idReceipt;
    private int oldIndex;
    private int newIndex;

    // Tính số tiền phải trả của biên lai
    public int calculateAmountPaid() {
        return (newIndex - oldIndex) * 750;
    }

    public Receipt() {
    }

    public Receipt(Customer customer, String idReceipt, int oldIndex, int newIndex) {
        this.customer = customer;
        this.idReceipt = idReceipt;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public String getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(String idReceipt) {
        this.idReceipt = idReceipt;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", idReceipt='" + idReceipt + '\'' +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
