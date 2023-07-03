package com.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.domain.Bo_notice;
import com.human.mapper.BoardMapper;

@Service			// 컨테이너의 빈으로 등록, 비즈니스 로직을 처리하는 서비스로 구분
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public List<Bo_notice> list() throws Exception {
		// 처리 로직
		return mapper.list();
	}

	@Override
	public Bo_notice read(int boardNo) throws Exception {
		
		return mapper.read(boardNo);
	}

	@Override
	public int insert(Bo_notice bo_notice) throws Exception {
		
		return mapper.insert(bo_notice);
	}

	@Override
	public int update(Bo_notice bo_notice) throws Exception {
		
		return mapper.update(bo_notice);
	}

	@Override
	public int delete(int boardNo) throws Exception {
		
		return mapper.delete(boardNo);
	}


}
