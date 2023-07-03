package com.human.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.human.domain.Student;

@Mapper
public interface StudentMapper {

	// 학생 등록
	public int insert(Student student) throws Exception;
	
}
