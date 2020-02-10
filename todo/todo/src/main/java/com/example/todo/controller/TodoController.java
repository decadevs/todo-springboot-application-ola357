package com.example.todo.controller;

import java.util.List;

import com.example.todo.model.TodoItem;
import com.example.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value ="/")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepository.findAll();
    }
}