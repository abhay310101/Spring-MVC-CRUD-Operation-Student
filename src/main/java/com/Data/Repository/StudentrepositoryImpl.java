package com.Data.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Data.Model.Student;

@Repository
public class StudentrepositoryImpl implements Studentrepository {

	@Autowired
	private SessionFactory sf;
	
	
	public void saveStudent(Student stu) {
		
		System.out.println("Inside Repositroy Layer");
		System.out.println(stu);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(stu);
		
		tx.commit();
	}


	public List<Student> getAllData() {
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Student");
		
		List<Student> list = query.getResultList();
		
		return list;
	}


	public List<Student> deleteStudent(int RollNo) {
	
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
	    Student stu = session.get(Student.class, RollNo);
		
		session.delete(stu);
		
		tx.commit();
		
		return getAllData();
	}


	public Student getStudentData(int RollNo) {
	
		Session session = sf.openSession();
		
		Student student = session.get(Student.class, RollNo);
				
		return student;
	}


	public List<Student> updateStudent(Student stu) {
	
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.update(stu);
		
		tx.commit();
			
		List<Student> list = getAllData();
			
		return list;
	}

}
