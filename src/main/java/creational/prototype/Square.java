package creational.prototype;

import java.util.Objects;

public class Square extends Shape {
    public Square(int width) {
        super(width, width);
    }

    public Square(Square square) {
        super(Objects.requireNonNull(square).getWidth(), square.getWidth());
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public Square clone() {
        return new Square(this);
    }

    private void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
