public class Device {
    String brand ;
    boolean isOn = false;

    Device(String brand){
        this.brand = brand ;
    }
    void turn0n(){
        isOn = true ;
        System.out.println(brand + " device is now ON.");
    }
}
