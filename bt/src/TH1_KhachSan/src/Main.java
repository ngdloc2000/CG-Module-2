import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        HotelManagement hotelManagement = new HotelManagement(hotelArrayList);
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("-----------------------------------");
            System.out.println("Chương trình quản lý khách sạn");
            System.out.println("1. Thêm khách trọ");
            System.out.println("2. Hiển thị thông tin các phòng trọ trong khách sạn");
            System.out.println("3. Tính giá tiền");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng khách muốn thuê: ");
                    int renterNum = scanner.nextInt();
                    while (renterNum > 0) {
                        System.out.println("Nhập tên: ");
                        String name = scanner1.nextLine();
                        System.out.println("Nhập ngày sinh: ");
                        String dob = scanner1.nextLine();
                        System.out.println("Nhập số CMND: ");
                        String id = scanner1.nextLine();
                        Human renter = new Human(name, dob, id);

                        System.out.println("Nhập số ngày thuê: ");
                        int daysOfRent = scanner.nextInt();
                        System.out.println("Nhập loại phòng trọ: ");
                        String typeOfHotel = scanner1.nextLine();
                        System.out.println("Nhập giá phòng: ");
                        int price = scanner.nextInt();
                        Hotel room = new Hotel(daysOfRent, typeOfHotel, price, renter);

                        hotelManagement.addRoom(room);
                        renterNum--;
                    }
                    break;
                case 2:
                    hotelManagement.showInfo();
                    break;
                case 3:
                    System.out.print("Nhập mã CCCD cần tính tiền phòng: ");
                    String id = scanner1.nextLine();
                    hotelManagement.calculatePrice(id);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
