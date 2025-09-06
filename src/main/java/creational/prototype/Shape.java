package creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public abstract Shape clone();
}
