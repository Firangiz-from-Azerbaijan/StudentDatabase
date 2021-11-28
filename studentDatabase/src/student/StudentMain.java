package student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Firuza", "45678912");
        Student s2 = new Student("Xalida", "45678913");
        Student s3 = new Student("Naila", "45678914");
        s1.enroll("Math10");
        s2.enroll("English11");
        s3.enroll("History12");

//        s1.showCourses();
//        s1.checkBalance();
//        s1.pay(500);
//        s1.checkBalance();
        System.out.println(s1.toString());



    }

}
