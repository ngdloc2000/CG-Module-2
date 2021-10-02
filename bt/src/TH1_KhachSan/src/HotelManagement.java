import java.util.ArrayList;

public class HotelManagement {
    ArrayList<Hotel> hotelRoomList;

    public HotelManagement() {
    }

    public HotelManagement(ArrayList<Hotel> hotelRoomList) {
        this.hotelRoomList = hotelRoomList;
    }

    public void addRoom(Hotel room) {
        hotelRoomList.add(room);
    }

    public void showInfo() {
        for (int i = 0; i < hotelRoomList.size(); i++) {
            System.out.println(i + 1 + "." + " " + hotelRoomList.get(i));
        }
    }

    public void calculatePrice(String id) {
        int res = 0;
        for (int i = 0; i < hotelRoomList.size(); i++) {
            if (hotelRoomList.get(i).getHuman().getIdNumber().equals(id)) {
                res = hotelRoomList.get(i).getPrice() * hotelRoomList.get(i).getDaysOfRent();
            }
        }
        System.out.println("Tiền phòng của khách có mã " + id + " là: " + res);
    }
}
