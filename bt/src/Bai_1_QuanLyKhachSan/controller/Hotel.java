package Bai_1_QuanLyKhachSan.controller;

import Bai_1_QuanLyKhachSan.model.Order;
import Bai_1_QuanLyKhachSan.model.Room;
import Bai_1_QuanLyKhachSan.model.User;

import java.util.ArrayList;

public class Hotel {
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Room> roomList = new ArrayList<>();
    ArrayList<Order> orderList = new ArrayList<>();

    // Hiển thị tất cả khách trọ
    public void showAllUser() {
        for (User user : userList
        ) {
            System.out.println(user);
        }
    }

    // Hiển thị tất cả các phòng đang có
    public void showAllRoom() {
        for (Room room : roomList
        ) {
            System.out.println(room);
        }
    }

    // Hiển thị các phòng còn trống
    public void showRoomAvailable() {
        for (Room room : roomList) {
            if (room.isStatus() == true) {
                System.out.println(room);
            }
        }
    }

    // HIển thị tất cả các hóa đơn đang có
    public void showAllOrder() {
        for (Order order : orderList
        ) {
            System.out.println(order);
        }
    }

    // Tính tiền cho 1 khách theo CMND
    public void getPricePerPerson(String cmnd) {
        for (Order ord : orderList
        ) {
            if (ord.getUser().getCode().equals(cmnd)) {
                System.out.println("Tiền phòng của khách trọ mã " + cmnd + " là: " + ord.getTotalPrice());
            } else System.out.println("Không đúng CMND");
        }
    }

    // Tính tổng doanh thu của các phòng đang cho thuê hiện tại
    public long getAllTotalHotel() {
        long total = 0;
        for (Order order : orderList
        ) {
            total += order.getTotalPrice();
        }
        return total;
    }

    // tìm khách trọ theo CMND
    public User searchUser(String id) {
        for (User user : userList) {
            if (user.getCode().equals(id)) {
                return user;
            }
        }
        return null;
    }

    // Thanh toán cho khách
    public void getPayAUser(String id) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getUser().getCode().equals(id)) {
                orderList.get(i).getRoom().setStatus(true);
                System.out.println("Thanh toán thành công");
                System.out.println("Số ngày thuê: " + orderList.get(i).getNumberOfRentalDays());
                System.out.println("Tiền phải trả: " + orderList.get(i).getTotalPrice());
                orderList.get(i).getRoom().setSumPriceRoom(orderList.get(i).getTotalPrice() + orderList.get(i).getRoom().getSumPriceRoom());
                orderList.get(i).getUser().setTotalPricesOfUser(orderList.get(i).getTotalPrice() + orderList.get(i).getUser().getTotalPricesOfUser());
                orderList.remove(i);
            }
        }
    }

    public void getCountNumberOfRentalsPerRoom(String nameRoom) {
        for (Room r : roomList
        ) {
            if (r.getName().equals(nameRoom)) {
                System.out.println("Số lượt thuê của phòng " + nameRoom + " là: " + r.getNumberOfHiresPerRoom());
            }
        }
    }

    public void getCountNumOfHiresPerPerson(String id) {
        for (User u : userList
        ) {
            if (u.getCode().equals(id)) {
                System.out.println("Số lượt thuê của khách có mã " + id + " là: " + u.getNumberOfHiresPerPerson());
            }
        }
    }

    public void getTotalPricePerRoom(String nameRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getName().equals(nameRoom)) {
                System.out.println(roomList.get(i).getSumPriceRoom());
            }
        }
    }

    public void getTotalPricePerUser(String cmnd) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getCode().equals(cmnd)) {
                System.out.println(userList.get(i).getTotalPricesOfUser());
            }
        }
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public Hotel(ArrayList<User> userList, ArrayList<Room> roomList, ArrayList<Order> orderList) {
        this.userList = userList;
        this.roomList = roomList;
        this.orderList = orderList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
