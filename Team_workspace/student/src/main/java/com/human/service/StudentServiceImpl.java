package com.human.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.domain.Student;
import com.human.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper mapper;
	
	@Override
	public int insert(Student student) throws Exception {
		
		// 학생 등록
		int result = mapper.insert(student);
		
		return result;
		
	}
}
