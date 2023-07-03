package com.human.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.human.domain.Board;
import com.human.domain.Files;
import com.human.domain.Page;
import com.human.domain.Product;
import com.human.service.FileService;
import com.human.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private FileService fileService;
	
	@GetMapping("/admin_product/product")
	public String list(Model model, Page page) throws Exception {
		
		List<Product> productList = service.list(page);
		
		log.info("page : " + page);
		model.addAttribute("page", page);
		model.addAttribute("productList", productList);
		
		return "/admin_product/product";
	}
	
	
	@GetMapping("/admin_product/registration")
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
	public String insertForm(Principal principal, Model model) {
		
		String prodNum = principal.getName();
		log.info("prodNum : " + prodNum);
		
		model.addAttribute("prodNum", prodNum);
		
		return "/admin_product/registration";		
	}
	
	@PostMapping("/admin_product/registration")
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
	public String insert(Product product) throws Exception {
		//  MultipartFile : 전송된 파일데이터를 다루는 인터페이스
		
		MultipartFile[] files = product.getFiles();
		
		if( files != null || files.length == 0 ) {
			// 요청된 첨부파일 확인
			for (MultipartFile file : files) {
				String fileName = file.getOriginalFilename();		// 파일 명
				String contentType = file.getContentType();			// 파일 타입(확장자)
				long size = file.getSize();							// 용량
				byte[] fileData = file.getBytes();					// 파일 데이터
				
				log.info("fileName : " + fileName);
				log.info("contentType : " + contentType);
				log.info("size : " + size);
			}
		}
		
		int result = service.insert(product);
		
		return "redirect:/admin_product/product";		// 게시글 쓰기 처리 후, 게시글 목록으로 리다이렉트
	}

	// 상품 읽기
	@GetMapping(path = "/admin_product/read", params = "prodNum")
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
	public String read(Model model, int prodNum, Files file, Principal principal) throws Exception {
		// 게시글 번호로 게시글 정보를 조회
		System.out.println("게시글 조회...");
		System.out.println("prodNum : " + prodNum);
		
		// 게시글 조회
		Product product = service.read(prodNum);
		
		// 파일 목록 조회
		file.setParentTable("product");
		file.setParentNo(prodNum);
		List<Files> fileList = fileService.listByParentNo( file );
		
		
		model.addAttribute("prodNum", prodNum);
		model.addAttribute("product", product);
		model.addAttribute("fileList", fileList);
		return "/admin_product/read";
	}
}