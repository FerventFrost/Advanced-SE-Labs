package com.todo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Model.todo;
import com.todo.Service.TodoService;


@RestController
@RequestMapping("/todo")
public class TodoController {
  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/gettodo")
  public List<todo> getTodos() {
      return todoService.getTodos();
  }
  
  @PostMapping("/addTodo")
  public todo addTodo(@RequestParam String name) {
      return todoService.addTodo(name);
  }

  @GetMapping("/getTodo/{id}")
  public todo getTodoById(@PathVariable long id) {
      return todoService.getTodoById(id);
  }
}
