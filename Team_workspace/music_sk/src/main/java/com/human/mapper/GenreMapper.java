package com.human.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.human.domain.Genre;

@Mapper
public interface GenreMapper {
	public List<Genre> rank() throws Exception;
}
