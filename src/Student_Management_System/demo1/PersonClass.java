package Student_Management_System.demo1;


public class PersonClass {
private  String name;
private  int age;
private  int personId;

PersonClass(String name,int age,int personId){
	this.name=name;
	this.age=age;
	this.personId=personId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}
}