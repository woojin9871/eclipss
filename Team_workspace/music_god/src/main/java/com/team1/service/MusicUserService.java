package com.team1.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.team1.domain.MusicUsers;

public interface MusicUserService {

	public int join(MusicUsers user) throws Exception;
	
	public HttpSession tokenAuthenticaion(MusicUsers user, HttpServletRequest reauest) throws Exception;
}
