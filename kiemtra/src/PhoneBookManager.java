import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBookManager {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    private static final String PHONE_REGEX = "^\\d{0,9}$";
    private static final String PHONE_REGEX = "^0{1}\\d{9}$";
    List<PhoneBook> phoneBookList;

    public PhoneBookManager() {
        this.phoneBookList = new ArrayList<>();
    }

    public List<PhoneBook> getPhoneBookList() {
        return phoneBookList;
    }

    public void setPhoneBookList(List<PhoneBook> phoneBookList) {
        this.phoneBookList = phoneBookList;
    }

    public PhoneBook enterPhoneBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phonenumber = scanner.nextLine();
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phonenumber);
        if (matcher.find()) {
            System.out.println("Nhập đúng");
        } else {
            System.out.println("Nhập sai rồi mời bạn nhập lại: ");
        }
        System.out.print("Nhập nhóm danh bạ: ");
        String group = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String render = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dob = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        Pattern pattern1 = Pattern.compile(EMAIL_REGEX);
        Matcher matcher1 = pattern1.matcher(email);
        if (matcher1.find()) {
            System.out.println("Nhập đúng");
        } else {
            System.out.println("Nhập sai");
        }
        PhoneBook phoneBook = new PhoneBook(phonenumber, group, name, render, address, dob, email);
        return phoneBook;
    }

    public void writeFile(){
        try {
            PhoneBookFileManager.writeFile(phoneBookList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayAllPhoneBook() {
        for (PhoneBook pb : phoneBookList
             ) {
            System.out.println(pb);
        }
    }

    public PhoneBook findPhoneBookByPhoneNum(String phonenumber) {
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getPhonenumber().equals(phonenumber)) {
                return phoneBook;
            }
        }
        return null;
    }

    public void enterInfor(PhoneBook phoneBook) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhóm: ");
        String group = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String render = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dob = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        phoneBook.setGroup(group);
        phoneBook.setName(name);
        phoneBook.setAddress(address);
        phoneBook.setDob(dob);
        phoneBook.setRender(render);
        phoneBook.setEmail(email);
    }

    public void editPhoneBook(String phonenumber) {
        PhoneBook phoneBook = findPhoneBookByPhoneNum(phonenumber);
        if (phoneBook != null) {
            try {
                enterInfor(phoneBook);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("Nhập sai số điện thoại");
    }

    public void addPhone() throws IOException {
        PhoneBook phoneBook = enterPhoneBookInfo();
        phoneBookList.add(phoneBook);
    }

    public void deletePhone(String phoneNumber) {
        PhoneBook phoneBook = findPhoneBookByPhoneNum(phoneNumber);
        if (phoneBook != null) {
            String yes = "Y";
            System.out.println("Bạn có muốn xóa không?");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            if (choose.equals(yes)) {
                phoneBookList.remove(phoneBook);
                System.out.println("Xóa thành công");
            }
        } else System.out.println("Nhập sai số điện thoại");
    }
}
