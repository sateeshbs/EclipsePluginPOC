package com.example;



public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

  
  public Student changeName(Student student) {
    student.setName("HELLO " + student.getName());
    return student;
  }

  
  public Student getName() {
    Student student = new Student();
    student.setName("Rockey");
    return student;
  }
  
  
  public String test(String name,
		  String password,
		  String url) {
    
    return "Name: "+name + "Password: "+password+"URL: "+url;
  }
}
