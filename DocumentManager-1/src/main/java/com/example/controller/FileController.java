package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.FileExample;
import com.example.repository.FileReposirory;
import com.example.service.FileService;

@CrossOrigin(origins = "http://localhost:3000",exposedHeaders = {"Content-Disposition"})
@RestController
@RequestMapping("/api")
public class FileController {
	
	@Autowired
	private FileService service;
	@Autowired
	private FileReposirory fileRepository;
	
	@GetMapping("/files")
	public List<FileExample> getFiles() {
		return service.fetchfiles();
	}
	@GetMapping("/download")
	public void doenloadFile(@Param("id") Integer id, HttpServletResponse response) throws Exception {
		Optional<FileExample> result = fileRepository.findById(id);
		if(!result.isPresent()) {
			throw new Exception("could not find document with ID: "+id);
		}
		FileExample document=result.get();
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attatchment; fileName="+document.getName();
		response.setHeader(headerKey, headerValue);
		ServletOutputStream outputStream = response.getOutputStream();
		outputStream.write(document.getContent());
		outputStream.close();
	}
	

}
