package Student_Management_System.demo1;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) throws StudentnullExcepetion, nullteacherException,nullCourseexception {
        Scanner sc=new Scanner(System.in);
        // Create a Course
        System.out.println("Enter course name and coursecode :");
        Course course = new Course(sc.next(), sc.next());

        // Create Students and enroll them in courses
        Studentclass student1 = null;
       System.out.println("no of students");
        int No_of_students=sc.nextInt();
        
        while(No_of_students!=0){
        	 System.out.println("enter Student name,student age,student id,student class ");
        student1 = new Studentclass(sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println("add student course taken:");
        student1.enrollStudent(sc.next());
        student1.enrollStudent(sc.next());
        course.addStudents(student1);
        No_of_students--;
        if(No_of_students!=0){
        System.out.println("Enter next stident name");
        }
        }
       
        // Create Teachers and assign them to courses
        System.out.println("Enter no of teachers");
        int no_of_teachers=sc.nextInt();
        Teacherclass teacher1=null;
        while(no_of_teachers!=0){
        System.out.println("Enter teacher name,teacher age,teacher code,teacher salary");
         teacher1 = new Teacherclass(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        System.out.println("Enter teacher specilization");
        teacher1.assignCourse(sc.next());
        teacher1.assignCourse(sc.next());
        
        course.addTeachers(teacher1);
        no_of_teachers--;
        if(no_of_teachers!=0){
        	System.out.println("Enter next teacher");
        }
        
        }
        // Display Course Information
        System.out.println("=== Course Information ===");
        course.displayCourseInfo();

        // Display Students' Details
        System.out.println("\n=== Enrolled Students' Details ===");
        System.out.println(student1);
       // System.out.println(student2);
        

        // Display Teachers' Details
        System.out.println("\n=== Assigned Teachers' Details ===");
       System.out.println(teacher1);
      
       
        
       
    }
}
