package com.todo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.todo.Model.todo;

@Service
public class TodoService {
  private final List<todo> todos = new ArrayList<>();
  private final AtomicLong counter = new AtomicLong();

  public todo addTodo(String name) {
    todo newTodo = new todo(counter.getAndIncrement(), name);
    todos.add(newTodo);
    return newTodo;
  }

  public List<todo> getTodos() {
    return todos;
  }

  public todo getTodoById(long id) {
    return todos.stream().filter(todo -> todo.Id() == id).findFirst().orElse(null);
  }
}
