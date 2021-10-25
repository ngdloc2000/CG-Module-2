import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PhoneBookManager phoneBookManager = new PhoneBookManager();

        int choose = -1;
        while (choose != 8) {
            System.out.println("---QUẢN LÝ DANH BẠ---");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới điện thoại");
            System.out.println("3. Cập nhật điện thoại");
            System.out.println("4. Xóa điện thoại");
            System.out.println("5. Tìm kiếm điện thoại");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chức năng xem danh sách");
                    phoneBookManager.displayAllPhoneBook();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới số điện thoại");
                    try {
                        phoneBookManager.addPhone();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần sửa: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String phonenumber = scanner1.nextLine();
                    phoneBookManager.editPhoneBook(phonenumber);
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    Scanner scanner2 = new Scanner(System.in);
                    String phonenumber2 = scanner2.nextLine();
                    phoneBookManager.deletePhone(phonenumber2);
                    break;
                case 5:
                    System.out.print("Nhập số điện thoại cần tìm: ");
                    Scanner scanner3 = new Scanner(System.in);
                    String phoneNumber = scanner3.nextLine();
                    System.out.println(phoneBookManager.findPhoneBookByPhoneNum(phoneNumber));
                    break;
                case 6:
                    phoneBookManager.setPhoneBookList(PhoneBookFileManager.readFile());
                    break;
                case 7:
                    phoneBookManager.writeFile();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
