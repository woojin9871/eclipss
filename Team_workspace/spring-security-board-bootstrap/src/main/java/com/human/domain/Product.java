package com.human.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Product {

	private int prodNum;
	private String name;
	private String kind;
	private int price1;
	private int price2;
	private int price3;
	private String content;
	private String useyn;
	private Date regDate;
	private Date updDate;
	
	
	private MultipartFile[] files;
}
