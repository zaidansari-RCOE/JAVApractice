public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle Area: " + rect1.getArea());

        Rectangle rect2 = new Rectangle(7, 3);
        System.out.println("Rectangle with width=7 and height=3 Area: " + rect2.getArea());
    }
}

