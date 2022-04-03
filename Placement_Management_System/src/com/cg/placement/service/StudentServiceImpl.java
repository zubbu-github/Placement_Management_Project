package com.cg.placement.service;

import com.cg.placement.entities.Student;
import com.cg.placement.repository.IStudentRepository;
import com.cg.placement.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService {

	// Step 1: Establishing connection between Service and Repo
	private IStudentRepository dao;
	public StudentServiceImpl() {
		dao = new StudentRepositoryImpl();
	}	
	
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public Student addStudent(Student student) {
      dao.beginTransaction();
      dao.addStudent(student);
      dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		return student;
	}
}
