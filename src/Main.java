public class Main {
    public static void main(String[] args){
        Car car1 = new Car("FORD" , "MUSTANG" , "YELLO" );
        Car car2 = new Car("FORD" , "MUSTANG" , "RED" );

        Car[] cars = {car1,car2};

        for(Car car : cars){
            car.carDetails();
        }


    }
}