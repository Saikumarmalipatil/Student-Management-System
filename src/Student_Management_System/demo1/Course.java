package Student_Management_System.demo1;

import java.util.ArrayList;

class StudentnullExcepetion extends Exception
{
	String message;
	StudentnullExcepetion(String message){
		this.message=message;
	}
	public String getmessage(){
		return message;
	}
}

class nullteacherException extends Exception
{
	String message;
	nullteacherException(String message){
		this.message=message;
	}
	public String getmessage(){
		return message;
	}
}

public class Course 
{
   private String courseName;
   private String courseCode;
   private ArrayList<Studentclass> enrolledStudents;
   private ArrayList<Teacherclass> assignedTeachers;

   public Course(String courseName, String courseCode) {
       this.courseName = courseName;
       this.courseCode = courseCode;
       enrolledStudents = new ArrayList<>();
       assignedTeachers = new ArrayList<>();
   }

   public void addStudents(Studentclass student) throws StudentnullExcepetion  {
   	if(student==null){
   		throw new StudentnullExcepetion("Student cannot be null");
   	}
   	else
   		
       enrolledStudents.add(student);
   }

   public void addTeachers(Teacherclass teacher) throws nullteacherException {
   	if(teacher==null){
   		throw new  nullteacherException("teacher cannot be null");
   	}
       assignedTeachers.add(teacher);
   }

   public void displayCourseInfo() {
       System.out.println("Course Name: " + courseName);
       System.out.println("Course Code: " + courseCode);
       System.out.println("Enrolled Students:");
       for (Studentclass student : enrolledStudents) {
           System.out.println(" - " + student.getName());
       }
       System.out.println("Assigned Teachers:");
       for (Teacherclass teacher : assignedTeachers) {
           System.out.println(" - " + teacher.getName());
       }
   }

   public ArrayList<Studentclass> getEnrolledStudents() {
       return enrolledStudents;
   }

   public ArrayList<Teacherclass> getAssignedTeachers() {
       return assignedTeachers;
   }
}
