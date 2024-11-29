package Student_Management_System.demo1;

import java.util.ArrayList;

public class Teacherclass extends PersonClass {

    private ArrayList<String> subjectSpecialization;
    private int salary;

    Teacherclass(String name, int age, int personId, int salary) {
        super(name, age, personId);
        this.subjectSpecialization = new ArrayList<>();
        this.salary = salary;
    }

    public ArrayList<String> getSubjectSpecialization() {
        return subjectSpecialization;
    }

    public void assignCourse(String course) {
        if (!subjectSpecialization.contains(course)) {
            subjectSpecialization.add(course);
        } else {
            System.out.println("Teacher already assigned to course: " + course);
        }
    }
    public String toString(){
    	StringBuilder details=new StringBuilder();
    	details.append("Name is : ").append(getName()).append("\nAge is ").append(getAge()).append("\nPersonid is :").append(getPersonId())
    	.append("\nSalary is :").append(salary).append("\nsubjectSpecialization are ");
    	for (String course : subjectSpecialization) {
           details.append(course+",");
        }
    	System.out.println();
    	return details.toString();
    }
}