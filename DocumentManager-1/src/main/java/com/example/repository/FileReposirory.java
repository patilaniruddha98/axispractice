package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.FileExample;

public interface FileReposirory extends JpaRepository<FileExample, Integer> {

}
