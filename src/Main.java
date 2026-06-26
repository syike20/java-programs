public class Main {
    public static void main(String[] args){
        Student student = new Student("Suraj",21,19,8.26,true);
        Student student1 = new Student("Dashrath",22,19,8.96,true);
        Student student2 = new Student("Sakshi",56, 19,9,true);
        System.out.println("Name :"+student.name+" RollNo: "+ student.RollNo );
        System.out.println("Name :"+student1.name+" RollNo: "+ student1.RollNo );
        System.out.println("Name :"+student2.name+" RollNo: "+ student2.RollNo );

    }
}