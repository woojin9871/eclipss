package com.team.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.team.domain.MusicUsers;

@Mapper
public interface MusicUserMapper {

	public int join(MusicUsers musicUser) throws Exception;
	
}
