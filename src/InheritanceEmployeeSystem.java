class Employee{
    String name;
    void clockIn(){
        System.out.println(this.name + " has clocked in.");
    }

}
class Manager extends Employee{
    void callMeeting(){
        System.out.println("Manager is calling a meeting!");
    }
}
public class InheritanceEmployeeSystem {
    public static void main(String[] args){
        Manager manager1 = new Manager();
                manager1.name = "Michael Scott";
                manager1.clockIn();
                manager1.callMeeting();
    }
}
