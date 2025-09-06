package creational.prototype;

public class Square extends Shape {
    public Square(int width) {
        super(width, width);
    }

    public Square(Square square) {
        super(square.getWidth(), square.getWidth());
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public Square clone() {
        return new Square(this);
    }
}
