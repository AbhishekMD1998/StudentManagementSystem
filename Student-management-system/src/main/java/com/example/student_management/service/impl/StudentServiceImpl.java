package com.example.student_management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Student;
import com.example.student_management.repo.StudentRepo;
import com.example.student_management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
		
	}

}
