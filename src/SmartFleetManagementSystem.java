class Drone{
    String model ;
    double batteryLevel ;
    boolean isAssigned ;

    Drone(){
        this.model = "Unknown";
        this.batteryLevel = 100;
        this.isAssigned = false;
    }
    Drone(String model){
        this.model = model;
    }

    void fly(int distance){
        batteryLevel -= distance*0.5;
    }

    void fly(int distance ,double windSpeed){
        batteryLevel -= distance*0.5 + (windSpeed *0.2);
    }
}
public class SmartFleetManagementSystem {
    public static void main(String[] args){
        Drone drone1 = new Drone();
        Drone drone2 = new Drone("Smart");
        System.out.println(drone1.model);
        System.out.println(drone2.model);

    }
}
