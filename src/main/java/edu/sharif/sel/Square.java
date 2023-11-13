package edu.sharif.sel;

public class Square extends Polygon {
    public Square(double length) {
        sidesLengths = new double[2];
        sidesLengths[0] = length;
        sidesLengths[1] = length;
    }

    public double computeArea() {
        return sidesLengths[0] * sidesLengths[1];
    }

    public double getLength() {
        return sidesLengths[0];
    }

    public void setLength(double length) {
        sidesLengths[0] = length;
        sidesLengths[1] = length;
    }
}
