package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Todo;
import com.example.demo.Repo.TodoRepo;

@RestController
public class TodoController {
  
  @Autowired
  private TodoRepo todorepo;

  @GetMapping("/todo")
  public List<Todo> getTodos() {
    return todorepo.findAll();
  }

  @PostMapping("/todo")
  public Todo AddTodo(@RequestBody Todo todo) {
    return todorepo.save(todo);
  }
}
