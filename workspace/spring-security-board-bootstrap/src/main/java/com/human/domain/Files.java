package com.human.domain;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 첨부파일
 * @author denim
 *
 */
@Data
public class Files {

	private int fileNo;				// 파일 번호
	private String parentTable; 	// 참조 테이블
	private int parentNo;			// 참조 번호
	private String fileName;		// 파일명
	private String filePath;		// 파일 경로
	private LocalDateTime regDate;	// 등록일자
	private LocalDateTime updDate;	// 수정일자
}
