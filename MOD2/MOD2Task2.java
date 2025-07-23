public class MOD2Task2 {
    public static void main(String[] args) {
        Shape shape1;
        shape1=new Circle(7.77);
        
        System.out.println("Area: "+shape1.area());

        Shape shape2;
        shape2=new Rectangle(4.5,6.5);

        System.out.println("Area: "+shape2.area());
    }
}

abstract class Shape{
    public abstract double area();
}

class Circle extends Shape{
    private double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double area(){
        return length*width;
    }
}
