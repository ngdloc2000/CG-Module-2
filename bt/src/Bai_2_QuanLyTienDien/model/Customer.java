package Bai_2_QuanLyTienDien.model;

public class Customer {
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
