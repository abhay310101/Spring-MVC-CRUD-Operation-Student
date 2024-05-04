package com.Data.Repository;

import com.Data.Model.Student;

import java.util.List;

public interface Studentrepository {

	
	void saveStudent(Student stu);

	List<Student> getAllData();

	List<Student> deleteStudent(int rollno);

	Student getStudentData(int rollno);

	List<Student> updateStudent(Student stu);
}
