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
        return "Saved";
    }

    public List<TodoEntity> getAllTodo() {
        return todoRepository.findAll();
    }

    public Optional<TodoEntity> getTodoByName(String name) {
        return todoRepository.findById(1L);
    }


}
