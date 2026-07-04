class Car{
    String brand ;
    int speed ;

    void drive(){
        System.out.println(brand + " is driving at " + speed + " mph!");
    }
}

public class CarFactory{
    public static void main(String[] args){
        Car car1 = new Car() ;
        car1.brand = "Ford";
        car1.speed = 90;
        car1.drive();
    }
}