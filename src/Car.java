public class Car{

    String carName ;
    String carModel ;
    String carColour ;
    static int NumOfCars ;
    void carDetails(){
        System.out.println("You drive a "+ this.carModel + " " + this.carName + " of colour " + this.carColour);
        System.out.println(NumOfCars);
    }

    Car(String carName , String carModel , String carColour){
        this.carName = carName;
        this.carModel = carModel;
        this.carColour = carColour;
        NumOfCars++;
    }

}
