package student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Chưa thay đổi ");
        System.out.println(s.toString());
        System.out.println();
        s.setName("Lộc");
        s.setClasses("C0821H1");
        System.out.println("Đã thay đổi ");
        System.out.println(s.toString());
    }
}
