package com.Data.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Data.Model.Student;
import com.Data.Repository.Studentrepository;





	
	@Service
	public class StudentServiceImpl implements Studentservice {

		@Autowired
		private Studentrepository repo;
		
		
		public void saveStudent(Student stu) {
			
			System.out.println("inside Service Layer");
			System.out.println(stu);
			repo.saveStudent(stu);
		}


		public boolean loginCheck(String username, String password) {
			
			if(username.equals("admin")&&password.equals("admin123"))
				return true;
			else
			    return false;
		}


		public List<Student> getAllData() {
			
			return repo.getAllData();
		}


		public List<Student> deleteStudent(int RollNo) {
			
			return repo.deleteStudent(RollNo);
		}


		public Student getStudentData(int RollNo) {
			
			return repo.getStudentData(RollNo);
		}


		public List<Student> updateStudent(Student stu) {
			
			return repo.updateStudent(stu);
		}

	}


