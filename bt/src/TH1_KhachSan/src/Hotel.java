import java.util.ArrayList;

public class Hotel {
    private int daysOfRent;
    private String typeOfHotel;
    private int price;
    private Human human;

    public Hotel() {
    }

    public Hotel(int daysOfRent, String typeOfHotel, int price,Human human) {
        this.daysOfRent = daysOfRent;
        this.typeOfHotel = typeOfHotel;
        this.price = price;
        this.human = human;
    }

    public int getDaysOfRent() {
        return daysOfRent;
    }

    public void setDaysOfRent(int daysOfRent) {
        this.daysOfRent = daysOfRent;
    }

    public String getTypeOfHotel() {
        return typeOfHotel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTypeOfHotel(String typeOfHotel) {
        this.typeOfHotel = typeOfHotel;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "daysOfRent=" + daysOfRent +
                ", typeOfHotel='" + typeOfHotel + '\'' +
                ", price=" + price +
                ", human=" + human +
                '}';
    }
}
