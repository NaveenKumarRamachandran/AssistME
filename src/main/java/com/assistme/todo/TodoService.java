package com.assistme.todo;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    TodoRepo todoRepository;

    public String saveTodo(TodoEntity todoEntity) {
        todoRepository.save(todoEntity);
        return  "Saved";
    }

    public List<TodoEntity> getAllTodo() {
        System.out.println(todoRepository.findAll().toString());
        return todoRepository.findAll();
    }

    public Optional<TodoEntity> getTodoByName(String name) {
        Optional<TodoEntity> todoEntity = todoRepository.findById(Long.valueOf(1));
        return todoEntity;
    }


}
