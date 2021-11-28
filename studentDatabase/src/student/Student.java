package student;

import java.util.Locale;

public class Student {
    private static int id = 1000;
    private String userId;
    private String name;
    private String ssnNo;
    private String email;
    private String phone;
    private String city;
    private String state;
    public String courses = "";
    private static final int costofCourse = 800;
    private int balance=0;


    public Student(String name, String ssnNo) {
        id++;
        this.name = name;
        this.ssnNo = ssnNo;
        setUserId();
        setEmail();
    }

    private void setEmail() {
        email = name.toLowerCase(Locale.ROOT) + "." + id + "@gmail.com";
        System.out.println("Your email: " + email);
    }

    public String getEmail(){
        return email;
    }
    private void setUserId() {
        int max = 9000;
        int min = 1000;
        int randomNum = (int) (Math.random() * (max - min));
        userId = id + "" + randomNum + ssnNo.substring(4);
        System.out.println("Your user id: " + userId);
    }

    public void enroll(String course) {
        this.courses = this.courses + "\n" + course;
        System.out.println(courses);
        balance = balance + costofCourse;
    }

    public void pay(int amount) {
        System.out.println("Payment: $" + amount);
        balance = balance - amount;

    }

    public void checkBalance() {
        System.out.println("Balance : $" + balance);

    }

    public String toString() {

        return "{Name: " + name + "}\n{Courses: " + courses + " }\n{Balance: " + balance + "}";
    }

    public void showCourses() {
        System.out.println(courses);

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
