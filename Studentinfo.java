import java.util.*;
class StudentInfoManager {
 String name;
 String gender;
 String language;
 String department;
 String address;
 int age;
 long mobileno;
 // Constructor
 StudentInfoManager(String name, String gender, String language,
 String department, String address,
 int age, long mobileno) {
 this.name = name;
 this.gender = gender;
 this.language = language;
 this.department = department;
 this.address = address;
 this.age = age;
 this.mobileno = mobileno;
 }
 // Method to display student details
 void StudentDetails() {
 System.out.println("\nStudent Details:");
 System.out.println("Name : " + name);
 System.out.println("Gender : " + gender);
 System.out.println("Language : " + language);
 System.out.println("Department : " + department);
 System.out.println("Address : " + address);
 System.out.println("Age : " + age);
 System.out.println("Mobile No : " + mobileno);
 }
}
class Main {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the Student Name:");
 String name = s.nextLine();
 System.out.println("Enter the Student Gender:");
 String gender = s.nextLine();
 System.out.println("Enter the Student Language:");
 String language = s.nextLine();
 System.out.println("Enter the Student Department:");
 String department = s.nextLine();
 System.out.println("Enter the Student Address:");
 String address = s.nextLine();
 System.out.println("Enter the Student Age:");
 int age = s.nextInt();
 System.out.println("Enter the Student Mobile No:");
 long mobileno = s.nextLong();
 StudentInfoManager s1 = new StudentInfoManager(
 name, gender, language, department, address, age, mobileno
 );
 s1.StudentDetails();
 }
}