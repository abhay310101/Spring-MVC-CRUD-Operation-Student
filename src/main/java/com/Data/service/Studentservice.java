package com.Data.service;
import java.util.List;
import com.Data.Model.Student;



public interface Studentservice {
	
	
void saveStudent(Student stu);
	
	boolean loginCheck(String username , String password);

	List<Student> getAllData();

	List<Student> deleteStudent(int rollno);

	Student getStudentData(int rollno);

	List<Student> updateStudent(Student stu);


}
