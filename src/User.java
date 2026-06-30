public class User {
    String username ;
    String email ;
    int accountAgeDays ;

    User(String email){
        this.username = "Guest";
        this.accountAgeDays = 0 ;
        this.email = email;
    }

    User(String username , String email){
        this.accountAgeDays = 0 ;
        this.email = email ;
        this.username = username ;
    }

}
