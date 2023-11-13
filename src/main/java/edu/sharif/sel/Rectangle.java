package edu.sharif.sel;

public class Rectangle extends Polygon {
    public Rectangle(double length, double width) {
        sidesLengths = new double[2];
        sidesLengths[0] = length;
        sidesLengths[1] = width;
    }

    public double computeArea() {
        return sidesLengths[0] * sidesLengths[1];
    }

    public double getLength() {
        return sidesLengths[0];
    }

    public double getWidth() {
        return sidesLengths[1];
    }

    public void setLength(double length) {
        sidesLengths[0] = length;
    }

    public void setWidth(double width) {
        sidesLengths[1] = width;
    }
}
