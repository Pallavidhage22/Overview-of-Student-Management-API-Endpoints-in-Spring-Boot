package com.tka.SpringDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.SpringDB.dao.StudentDao;
import com.tka.SpringDB.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String InsertData(Student s) {
		String msg = dao.InsertData(s);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public Student getSingleData(int id) {
		return dao.getsingleData(id);
	}

	public List<Student> getalldata() {
		return dao.getalldata();
	}
}
