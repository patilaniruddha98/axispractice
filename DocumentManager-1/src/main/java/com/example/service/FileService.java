package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.FileExample;
import com.example.repository.FileReposirory;

@Service
public class FileService {
	@Autowired
	private FileReposirory fileRepository;
	
	public List<FileExample> fetchfiles() {
		return (List<FileExample>) fileRepository.findAll();
	}
	
	

}
