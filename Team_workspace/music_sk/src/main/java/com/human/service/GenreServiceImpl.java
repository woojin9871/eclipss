package com.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.domain.Genre;
import com.human.mapper.GenreMapper;

@Service
public class GenreServiceImpl implements GenreService {
	
	@Autowired GenreMapper mapper;
	
	@Override
	public List<Genre> rank() throws Exception{
		return mapper.rank();
	}
}
