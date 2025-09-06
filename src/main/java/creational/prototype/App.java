package creational.prototype;

public class App {
    public static void main(String[] args) {
        /* This basic implementation of the Prototype design pattern demonstrates its core idea.
           For a more advanced solution, you could expand upon it by implementing deep and shallow copying
           to handle reference types or by creating a prototype registry.
           By the way, you can leverage java Cloneable interface, too.
         */

        Square square1 = new Square(2);
        Square square2 = square1.clone();

        square2.setWidth(4);

        System.out.printf("Square1 width: %d\n", square1.getWidth());
        System.out.printf("Square2 width: %d\n", square2.getWidth());


        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = rectangle1.clone();

        rectangle2.setWidth(7);
        rectangle2.setHeight(10);

        System.out.print("\n");
        System.out.printf("Rectangle1 width: %d\n", rectangle1.getWidth());
        System.out.printf("Rectangle1 height: %d\n", rectangle1.getHeight());
        System.out.printf("Rectangle2 width: %d\n", rectangle2.getWidth());
        System.out.printf("Rectangle2 height: %d\n", rectangle2.getHeight());
    }
}
