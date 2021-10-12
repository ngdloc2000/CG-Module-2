package Bai_2_QuanLyTienDien.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
    private String name;
    private String apartmentNumber;
    private String idElectricMeter;

    public Customer() {
    }

    public Customer(String name, String apartmentNumber, String idElectricMeter) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.idElectricMeter = idElectricMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getIdElectricMeter() {
        return idElectricMeter;
    }

    public void setIdElectricMeter(String idElectricMeter) {
        this.idElectricMeter = idElectricMeter;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", idElectricMeter='" + idElectricMeter + '\'' +
                '}';
    }
}
