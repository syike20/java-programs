public class SmartLight extends Device{
    int brightness ;
    String color;

    SmartLight(String brand , int brightness , String color)
    {
        super(brand);
        this.brightness = brightness;
        this.color = color;
    }

    void turnOn(){
        super.turn0n();

        System.out.println("Setting brightness to " + brightness + " and color to " +color +".");
    }
}
