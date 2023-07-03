package com.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.human.domain.Student;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StudentController {

	@PostMapping("/board/insert")
	public String insert(Student student) throws Exception {
		
				
			}
	int result = service.insert(student);
		
		
		return "redirect:/";		// 게시글 쓰기 처리 후, 게시글 목록으로 리다이렉트
	}
}
