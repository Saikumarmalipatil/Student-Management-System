package Student_Management_System.demo1;

import java.util.ArrayList;

class nullCourseexception extends Exception
{
	String getmessage;
	
	nullCourseexception(String getmessage){
		this.getmessage=getmessage;
	}
	
	public String getMessage(){
		return getmessage;
	}
}

public class Studentclass extends PersonClass {
    
    private String grade;
    private ArrayList<String> courses;

    Studentclass(String name, int age, int personId, String grade) {
        super(name, age, personId);
        this.grade = grade;
        courses = new ArrayList<>();
    }

    public void enrollStudent(String courseName) throws nullCourseexception{
    	if(courseName==null){
    		throw new nullCourseexception("Course should not be null");
    	}
    	
        if (!courses.contains(courseName)) {
            courses.add(courseName);
        } else {
            System.out.println("Student already enrolled in " + courseName);
        }
    }
    
    public String toString(){
    	StringBuilder details=new StringBuilder();
    	details.append("Name is : ").append(getName()).append("\nAge is ").append(getAge()).append("\nPersonid is :").append(getPersonId())
    	.append("\nGrade is :").append(grade).append("\nCourses are ");
    	for (String course : courses) {
           details.append(course+",");
        }
    	System.out.println();
    	return details.toString();
    }
    

  
}
