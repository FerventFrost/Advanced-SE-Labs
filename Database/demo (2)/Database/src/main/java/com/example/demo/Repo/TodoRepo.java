package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {
  
}
