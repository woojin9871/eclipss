package com.human.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.human.domain.Page;
import com.human.domain.Product;

@Mapper
public interface ProductMapper {

	// 상품 목록
	public List<Product> list() throws Exception;
	
	// 상품 조회
	public Product read(int prodNum) throws Exception;
	
	// 상품 등록
	public int insert(Product product) throws Exception;
	
	// 게시글 개수 조회
	public int count() throws Exception;
	
	// 페이징 처리
	public List<Product> listWithPage(Page page) throws Exception;
}
