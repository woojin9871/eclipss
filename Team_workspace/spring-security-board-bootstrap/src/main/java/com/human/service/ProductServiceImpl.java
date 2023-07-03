package com.human.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.human.domain.Files;
import com.human.domain.Page;
import com.human.domain.Product;
import com.human.mapper.FileMapper;
import com.human.mapper.ProductMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	// 업로드 경로
	@Value("${upload.path}")			
	private String uploadPath; 
	
	@Autowired
	private ProductMapper mapper;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Override
	public List<Product> list() throws Exception {
		
		return mapper.list();
	}
	
	// 상픔 조회
	public Product read(int prodNum) throws Exception {
		
		return mapper.read(prodNum);
	}
	
	@Override
	public int insert(Product product) throws Exception {
		
		// 상품 등록
		int result = mapper.insert(product);
		
		if( result == 0) return result;
		
		MultipartFile[] files = product.getFiles();
		
		for (MultipartFile file : files) {
			byte[] fileData = file.getBytes();
			
			UUID uid = UUID.randomUUID();
			String fileName = file.getOriginalFilename();
			fileName = uid.toString() + "_" + fileName;
			
			File uploadFile = new File(uploadPath, fileName);
			
			FileCopyUtils.copy(fileData, uploadFile);
			
			Files uploadedFile = new Files();
			uploadedFile.setFileName(fileName);
			uploadedFile.setFilePath(uploadPath + fileName);
			uploadedFile.setParentTable("product");
			
			fileMapper.insert(uploadedFile);
		}
		
		return result;
	}
	
	@Override
	public List<Product> list(Page page) throws Exception {
		
		int totalCount = mapper.count();
		
		log.info("totalCount : " + totalCount);
		
		page.setTotalCount(totalCount);
		
		List<Product> productList = mapper.listWithPage(page);
		
		return productList;
	}
}
