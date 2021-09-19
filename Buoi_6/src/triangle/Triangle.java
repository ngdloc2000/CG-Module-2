package triangle;

import java.util.Scanner;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private String color;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getAria() {
        double p = this.getPerimeter() / 2.0;
        double s = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return s;
    }

    @Override
    public String toString() {
        return "Cạnh 1 = " + this.side1 + " Cạnh 2 = " + this.side2 + " Cạnh 3 = " + this.side3 + " Mau " + this.color +
                " Diện tích = " + this.getAria() + " Chu vi = " + this.getPerimeter();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mòi bạn nhập canh 1: ");
        this.side1 = scanner.nextDouble();
        System.out.println();

        System.out.print("Mòi bạn nhập canh 2: ");
        this.side2 = scanner.nextDouble();
        System.out.println();

        System.out.print("Mòi bạn nhập canh 3: ");
        this.side3 = scanner.nextDouble();
        System.out.println();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Mời bạn nhập màu: ");
        this.color = scanner1.nextLine();
        System.out.println();

        if (this.side1<this.side2+this.side3 && this.side2<this.side1+this.side3 && this.side3<this.side1+this.side2) {
            this.getAria();
        } else {
            System.out.println("Không phải tam giác");
        }
    }
}
