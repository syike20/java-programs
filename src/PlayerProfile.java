class Player{
    String username ;
    int health ;

    Player(String username , int health){
        this.username = username ;
        this.health = health ;
    }
}
public class PlayerProfile {
    public static void main(String[] args){
        Player player1 = new Player("Carl Johnson",98);
        Player player2 = new Player("Arthur Morgan",70);
        System.out.println(player1.username + " has " + player1.health + " health!");
        System.out.println(player2.username + " has " + player2.health + " health!");
    }
}
