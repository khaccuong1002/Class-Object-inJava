package com.codegym;

public class Fan {
    private int SLOW = 1;
    private boolean ON = false;
    private double radius = 5;
    private String blue;

    public Fan() {
    }

    public Fan(int SLOW, boolean ON, double radius, String blue) {
        this.SLOW = SLOW;
        this.ON = ON;
        this.radius = radius;
        this.blue = blue;
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public boolean isON() {
        return ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", ON=" + ON +
                ", radius=" + radius +
                ", blue='" + blue + '\'' +
                '}';
    }
}
