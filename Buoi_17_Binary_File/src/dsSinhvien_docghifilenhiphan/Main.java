package dsSinhvien_docghifilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // ghi danh sách học viên hiện có vào trong file nhị phân
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // lấy ra danh sách học viên đang có trong file student.txt
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\dsSinhvien_docghifilenhiphan\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\dsSinhvien_docghifilenhiphan\\student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
