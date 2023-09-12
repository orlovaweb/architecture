public class Triangle implements IShape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double halfOfPerimeter=this.getPerimeter()/2;
        return Math.sqrt(halfOfPerimeter*(halfOfPerimeter-this.firstSide)*(halfOfPerimeter-this.secondSide)*(halfOfPerimeter-this.thirdSide));
    }

    @Override
    public double getPerimeter() {
        return this.firstSide+this.secondSide+this.thirdSide;
    }
}
