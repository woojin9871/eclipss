package com.human.controller;
//TOP100
//한국 대중음악//  발라드, 댄스, 랩/힙합, R&B/Soul, 인디음악, 록/메탈, 트로트, 포크/블루스
//해외 POP음악// POP, 록/메탈, 랩/힙합, R&B/Soul, 포크/블루스/컨트리
//그외 인기장르// OST, 재즈, 뉴에이지, J-pop, 월드뮤직, CCM, 어린이/태교, 종교음악, 국악

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

//2가지 카테고리 목록 - 화면  GET /	Rank/list
//장르 카테고리 읽기 - 화면 GET/		Rank/genre
@Slf4j
@Controller
public class RankController {
		
	@GetMapping("/rank/list")
	public String list() {
		
		return "/rank/list";
		
	}

	
	
}
