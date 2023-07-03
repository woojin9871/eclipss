package com.team.service;

import com.team.domain.MusicUsers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public interface MusicUserService {

	public int join(MusicUsers musicUser) throws Exception;
}
