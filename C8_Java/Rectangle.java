package C8_Java;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException(
                    "value out of range"
            );
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException(
                    "value out of range"
            );
        }
        this.width = width;
    }

    public double perimeter() {

        return (width + length) * 2;
    }

    public double area() {

        return 0.5 * (Math.pow(length, 2) + Math.pow(width, 2));
    }
}