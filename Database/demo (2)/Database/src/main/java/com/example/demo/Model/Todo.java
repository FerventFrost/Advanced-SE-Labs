package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="TodoList")
public class Todo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long Id;

    @Column(name = "todoName", nullable=false)
    String Name;

    @Column(name = "todoDescription")
    String Description;

    public Todo() {
    }

    public Todo(String Name, String DescString) {
    this.Name = Name;
    this.Description = DescString;
    }

    public long getId() {
      return Id;
    }

    public String getName() {
      return Name;
    }

    public void setName(String name) {
      Name = name;
    }

    public String getDescription() {
      return Description;
    }

    public void setDescription(String description) {
      Description = description;
    }
  }
