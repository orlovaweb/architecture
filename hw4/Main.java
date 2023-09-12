// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Rectangle rectangle1=new Rectangle(5,10);
        Triangle triangle1=new Triangle(3,4,5);
        figureBox.add(circle1);
        figureBox.add(rectangle1);
        figureBox.add(triangle1);
        figureBox.remove(0);

        figureBox.getInfo(0);
        figureBox.search(triangle1);
    }
}