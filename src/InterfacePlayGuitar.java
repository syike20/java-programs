interface Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Strumming the guitar strings...");
    }
}
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Pressing the piano keys...");
    }
}
public class InterfacePlayGuitar {
    public static void main(String[] args){
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        guitar.play();
        piano.play();
    }
}
