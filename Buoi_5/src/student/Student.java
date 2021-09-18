package student;

public class Student {
    private String name;
    private String classes;

    Student() {
        this.name = "John";
        this.classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Tên " + this.name + "   Lớp " + this.classes;
    }
}
