package com.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.domain.MusicUsers;
import com.team.mapper.MusicUserMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MusicUserServiceImpl implements MusicUserService {

	@Autowired
	private MusicUserMapper mapper;

	@Override
	public int join(MusicUsers musicUser) throws Exception {

		int result = mapper.join(musicUser);

		String userId = musicUser.getUserId();

		return result;
	}
}