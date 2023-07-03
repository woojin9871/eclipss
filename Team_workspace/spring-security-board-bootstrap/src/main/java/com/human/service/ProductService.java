package com.human.service;

import java.util.List;

import com.human.domain.Page;
import com.human.domain.Product;

public interface ProductService {
	
	// 상품 목록
	public List<Product> list() throws Exception;

	// 상품 조회
	public Product read(int prodNum) throws Exception;
	
	// 상품 등록
	public int insert(Product product) throws Exception;
	
	// 페이징 처리
	public List<Product> list(Page page) throws Exception;

}
