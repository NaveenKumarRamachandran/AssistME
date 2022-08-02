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
        Optional<TodoEntity> todo = todoRepository.findTodoEntityByName(todoEntity.getName());
        if (todo.isPresent()) {
        throw new IllegalStateException("Name Already Exist");
        }
        todoRepository.save(todoEntity);
        return  "Saved";
    }

    public List<TodoEntity> getAllTodo() {
        System.out.println(todoRepository.findAll().toString());
        return todoRepository.findAll();
    }

    public Optional<TodoEntity> getTodoByName(String name) {
        Optional<TodoEntity> todoEntity = todoRepository.findTodoEntityByName(name);
        return todoEntity;
    }


}
