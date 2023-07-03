package com.human.service;

import java.util.List;

import com.human.domain.Bo_notice;

public interface BoardService {

	// 게시글 목록
	public List<Bo_notice> list() throws Exception;
	
	// 게시글 조회
	public Bo_notice read(int boardNo) throws Exception;
	
	// 게시글 등록
	public int insert(Bo_notice bo_notice) throws Exception;
	
	// 게시글 수정
	public int update(Bo_notice bo_notice) throws Exception;
	
	// 게시글 삭제
	public int delete(int boardNo) throws Exception;
	
}
