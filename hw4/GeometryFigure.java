import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    static private List<IShape> toolbox;
    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }
    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }
    // Метод для удаления фигуры
    public void remove(int num) {
        toolbox.remove(num);
    }
    // Метод поиска необходимой фигуры
    public void search(IShape figure){
        int index=toolbox.indexOf(figure);
        if(index>=0){
            System.out.printf("Ваша фигура находится на позиции %d",index);
        }else {
            System.out.println("Нет такой фигуры в списке.");
        }
    }
    // Метод отображения подробной информации о фигуре
    public void getInfo(int num) {
        if (num<=toolbox.size()-1) {
            IShape figure = toolbox.get(num);
            System.out.printf("Площадь равна %.2f\n",figure.getArea());
            System.out.printf("Периметр равен %.2f\n",figure.getPerimeter());
        }
else {
            System.out.println("Нет фигуры под таким номером");
        }
    }

}
