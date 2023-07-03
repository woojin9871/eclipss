package com.human.domain;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * 회원 
 * @author h
 *
 */
@Data
public class Users {
	
	private int userNo;					// 회원번호
	private String userId;				// 아이디
	private String userPw;				// 패스워드
	private String userPwChk;			// 패스워드 확인
	private String name;				// 이름
	private String email;				// 이메일
	private int enabled;				// 휴면여부
	private LocalDateTime regDate;		// 등록일자
	private LocalDateTime updDate;		// 수정일자
	private Number phon;					// 전화번호
	private Number old;					// 나이
	private String addr;				// 주소
	private String addr_de;				// 상세주소
	private int admin;					// 관리자 여부

}








