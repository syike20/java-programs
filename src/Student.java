public class Student {
    String name ;
    int RollNo ;
    int age ;
    double gpa ;
    boolean isEnrolled ;

    Student(String name, int RollNo, int age, double gpa, boolean isEnrolled){
        this.name = name;
        this.RollNo = RollNo;
        this.age = age ;
        this.gpa = gpa ;
        this.isEnrolled = isEnrolled;
    }
    void Study()
    {
        System.out.println(this.name +"Is studying....");
    }
}