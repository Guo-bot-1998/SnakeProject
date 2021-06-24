package src.object;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * 遊戲物件類，儲存基本屬性
 * 座標，長寬
 * */
public class GameObject {
   	protected DoubleProperty widthProperty;
	protected DoubleProperty heightProperty;
	protected DoubleProperty xProperty;
	protected DoubleProperty yProperty;

    GameObject(){
        ;
    }

    GameObject(double x, double y, double width, double length){
        this.xProperty = new SimpleDoubleProperty(x);
        this.yProperty = new SimpleDoubleProperty(y);
        this.widthProperty = new SimpleDoubleProperty(width);
        this.heightProperty = new SimpleDoubleProperty(length);
    }
}
