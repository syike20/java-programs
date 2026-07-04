abstract class Shape{
    abstract void calculateArea();
}

class Rectangle extends Shape{
    int length;
    int width;

    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea(){
        System.out.println("The rectangle area is: " + length * width);
    }
}
public class AbstractionCalculateArea {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(50,75);
        rectangle.calculateArea();
    }
}
