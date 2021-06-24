package src.object;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

//螢幕參數
public class ScrConst{
    //size of the screen
    public final static DoubleProperty width = new SimpleDoubleProperty(600);
    public final static DoubleProperty length = new SimpleDoubleProperty(800);
    public final static DoubleProperty unitX = new SimpleDoubleProperty(20);
    public final static DoubleProperty unitY = new SimpleDoubleProperty(20);
    public final static DoubleProperty distance = new SimpleDoubleProperty(4);
      
    //direction allowed
    enum Direction{
        UP, LEFT, DOWN, RIGHT;
    }
}