package com.human.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.human.domain.Bo_notice;


@Mapper				// Mybatis 의 매퍼 인터페이스로 빈 등록
public interface BoardMapper {
	
	// 게시글 목록
	public List<Bo_notice> list() throws Exception;
	
	// 게시글 조회
	public Bo_notice read(int boardNo) throws Exception;
	
	// 게시글 등록
	// public int insert(String title, String writer, String content) throws Exception;
	public int insert(Bo_notice board) throws Exception;
	
	// 게시글 수정
	// Map<String, String> map = new HashMap<String, String>();
	// map.put("title", "제목");
	// map.put("writer", "작성자");
	// map.put("content", "내용");
	// map.put("boardNo", "10");
	// public int update(Map<String, String> map) throws Exception;
	public int update(Bo_notice board) throws Exception;
	
	// 게시글 삭제
	// @Param("파라미터명") : xml 매퍼 파일의 SQL 쿼리에서 매핑될 파라미터명을 명시하는 어노테이션
	public int delete(@Param("boardNo") int boardNo) throws Exception;

}
