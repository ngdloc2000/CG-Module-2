package Bai_1_QuanLyKhachSan.model;

import java.util.ArrayList;

public class Room {
    private String name;
    private String type;
    private int price;
    public boolean status;
    public int numberOfHiresPerRoom;
    public long sum;

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public Room(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = true;
        this.numberOfHiresPerRoom = 0;
        this.sum = 0;
    }

    public Room(String name, String type, int price, boolean status) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setNumberOfHiresPerRoom(int numberOfHiresPerRoom) {
        this.numberOfHiresPerRoom = numberOfHiresPerRoom;
    }

    public int getNumberOfHiresPerRoom() {
        return numberOfHiresPerRoom;
    }

    public void setNumberOfHires(int numberOfHires) {
        this.numberOfHiresPerRoom = numberOfHires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
