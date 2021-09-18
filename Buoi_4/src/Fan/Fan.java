package Fan;

public class Fan {
    final int SLOW;
    final int MEDIUM;
    final int FAST;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    @Override
    public String toString() {
        if (this.on == true) {
            return "Speed is " + this.speed + " Color is " + this.color + " Radius is " + this.radius + " Fan is on";
        } else return  "Color is " + this.color + " Radius is " + this.radius + " Fan is off";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
