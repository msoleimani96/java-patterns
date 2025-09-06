package creational.prototype;

import java.util.Objects;

public class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    public Rectangle(Rectangle rectangle) {
        super(Objects.requireNonNull(rectangle).getWidth(), rectangle.getHeight());
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
