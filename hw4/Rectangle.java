public class Rectangle implements IShape{
    private double width;
    private double length;
    public Rectangle(double width,double length) {
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*this.length+2*this.width;
    }
}
