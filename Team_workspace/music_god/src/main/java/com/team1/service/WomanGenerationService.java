package com.team1.service;

import java.util.List;

import com.team1.domain.WomanGeneration;

public interface WomanGenerationService {

	// 세대별 음악 목록
	public List<WomanGeneration> list() throws Exception;
}
