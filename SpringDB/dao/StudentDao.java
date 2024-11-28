package com.tka.SpringDB.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.SpringDB.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String InsertData(Student s) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(s);
		tr.commit();
		ss.close();
		return "record is set";
	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = ss.get(Student.class, id);

		ss.remove(s);
		tr.commit();
		ss.close();
		return "data is deleted";

	}

	public Student getsingleData(int id) {

		Session ss = factory.openSession();
		Student s = ss.get(Student.class, id);
		ss.close();
		return s;

	}

	public List<Student> getalldata() {
		Session ss = factory.openSession();
		List<Student> s = ss.createQuery("from Student ", Student.class).list();
		ss.close();
		return s;

	}

}
