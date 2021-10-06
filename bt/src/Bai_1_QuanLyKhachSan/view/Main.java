package Bai_1_QuanLyKhachSan.view;

import Bai_1_QuanLyKhachSan.controller.Hotel;
import Bai_1_QuanLyKhachSan.model.Order;
import Bai_1_QuanLyKhachSan.model.Room;
import Bai_1_QuanLyKhachSan.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        ArrayList<Room> roomList = new ArrayList<>();
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Order> orderList = new ArrayList<>();

        Room r0 = new Room("Phòng 0", "VIP", 100000);
        Room r1 = new Room("Phòng 1", "Trung bình", 60000);
        Room r2 = new Room("Phòng 2", "Bình thường", 30000);

        roomList.add(r0);
        roomList.add(r1);
        roomList.add(r2);
        User u1 = new User("Lộc", "15-03-2000", "1234");
        User u2 = new User("Khánh", "30-08-2000", "456");
        User u3 = new User("Đức", "10-11-2000", "8935");
        User u4 = new User("Nam", "05-06-2000", "1288");

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

        Order o1 = new Order(LocalDate.of(2021, 9, 9), LocalDate.of(2021, 9, 12), u1, r0);
        Order o2 = new Order(LocalDate.of(2021, 8, 9), LocalDate.of(2021, 8, 10), u2, r1);
        orderList.add(o1);
        orderList.add(o2);
        Hotel hotel = new Hotel(userList, roomList, orderList);
        int choice = -1;
        String name, dOB, type, cmnd;
        int price;
        while (choice != 0) {
            System.out.println("----------------------------------------------------");
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ KHÁCH SẠN-----------");
            System.out.println("1. Thêm phòng mới");
            System.out.println("2. Thêm khách mới");
            System.out.println("3. Tạo hóa đơn cho khách");
            System.out.println("4. Hiển thị thông tin tất cả phòng hiện có");
            System.out.println("5. Hiển thị thông tin tất cả hóa đơn");
            System.out.println("6. Hiển thị thông tin tất cả khách");
            System.out.println("7. Tính tiền phòng cho khách theo CMND");
            System.out.println("8. Tính tổng doanh thu");
            System.out.println("9. Thanh toán");
            System.out.println("10. Thống kê số lần phòng được thuê");
            System.out.println("11. Thống kê số lần thuê của 1 người theo CMND");
            System.out.println("12. Tính doanh thu của 1 phòng");
            System.out.println("13. Tính tổng tiền của 1 khách trên hệ thống");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên phòng: ");
                    name = scanner1.nextLine();
                    System.out.print("Nhập loại phòng: ");
                    type = scanner1.nextLine();
                    System.out.print("Nhập giá phòng: ");
                    price = scanner.nextInt();
                    Room room = new Room(name, type, price);
                    roomList.add(room);
                    break;
                case 2:
                    System.out.println("NHẬP THÔNG TIN KHÁCH MỚI");
                    System.out.print("Nhập họ và tên: ");
                    name = scanner1.nextLine();
                    System.out.print("Nhập ngày sinh: ");
                    dOB = scanner1.nextLine();
                    System.out.print("Nhập CMND: ");
                    cmnd = scanner1.nextLine();
                    User userNew = new User(name, dOB, cmnd);
                    userList.add(userNew);
                    break;
                case 3:
                    System.out.println("NHẬP THÔNG TIN LỊCH ĐẶT PHÒNG");
                    User user;
                    System.out.print("Nhập CMND của khách: ");
                    String id = scanner1.nextLine();
                    if (hotel.searchUser(id) == null) {
                        System.out.println("Không có khách này");
                    } else {
                        user = hotel.searchUser(id);
                        System.out.print("Nhập ngày đến: ");
                        String in = scanner1.nextLine();
                        System.out.print("Nhập ngày đi: ");
                        String out = scanner1.nextLine();
                        LocalDate checkIn = LocalDate.parse(in);
                        LocalDate checkOut = LocalDate.parse(out);

                        System.out.println("---------------------------");
                        System.out.println("CÁC PHÒNG CÒN TRỐNG");
                        hotel.showRoomAvailable();
                        System.out.print("Nhập tên phòng muốn chọn: ");
                        name = scanner1.nextLine();
                        for (int i = 0; i < roomList.size(); i++) {
                            if (roomList.get(i).getName().equals(name) && roomList.get(i).isStatus()) {
                                orderList.add(new Order(checkIn, checkOut, user, roomList.get(i)));
                                System.out.println("Tạo hóa đơn thành công");
                            }
//                            else if (!roomList.get(i).getName().equals(name) || roomList.get(i).isStatus() == false) {
//                                System.out.println("Phòng đã có người đặt");
//                            }
                        }
                    }
                    break;
                case 4:
                    hotel.showAllRoom();
                    break;
                case 5:
                    hotel.showAllOrder();
                    break;
                case 6:
                    hotel.showAllUser();
                    break;
                case 7:
                    System.out.print("Nhập CMND của khách cần tính: ");
                    cmnd = scanner1.nextLine();
                    hotel.getPricePerPerson(cmnd);
                    break;
                case 8:
                    System.out.println("Tổng doanh thu là: " + hotel.getAllTotalHotel());
                    break;
                case 9:
                    System.out.print("Nhập CMND của khách: ");
                    cmnd = scanner1.nextLine();
                    hotel.getPayAUser(cmnd);
                    break;
                case 10:
                    System.out.print("Nhập tên phòng: ");
                    name = scanner1.nextLine();
                    hotel.getCountNumberOfRentalsPerRoom(name);
                    break;
                case 11:
                    System.out.print("Nhập CMNĐ của khách: ");
                    cmnd = scanner1.nextLine();
                    hotel.getCountNumOfHiresPerPerson(cmnd);
                    break;
                case 12:
                    System.out.print("Nhập tên phòng: ");
                    name = scanner1.nextLine();
                    hotel.getTotalPricePerRoom(name);
                    break;
                case 13:
                    System.out.print("Nhập CMND của khách: ");
                    cmnd = scanner1.nextLine();
                    hotel.getTotalPricePerUser(cmnd);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
