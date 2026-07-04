import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args ){

        ArrayList <String> guestList = new ArrayList<String>();
        guestList.add("Oggy");
        guestList.add("Shinchan");
        guestList.add("Goku");

        guestList.remove("Oggy");

        System.out.println("Total number of Guests : " + guestList.size());

        for(String guest : guestList){
            System.out.println("Guest : " + guest);
        }

    }
}