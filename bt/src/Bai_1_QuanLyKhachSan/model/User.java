package Bai_1_QuanLyKhachSan.model;

public class User {
    private String fullName;
    private String dOB;
    private String code;
    public int numberOfHiresPerPerson;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", dOB='" + dOB + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public User(String fullName, String dOB, String code) {
        this.fullName = fullName;
        this.dOB = dOB;
        this.code = code;
        this.numberOfHiresPerPerson = 0;
    }

    public int getNumberOfHiresPerPerson() {
        return numberOfHiresPerPerson;
    }

    public void setNumberOfHiresPerPerson(int numberOfHiresPerPerson) {
        this.numberOfHiresPerPerson = numberOfHiresPerPerson;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
