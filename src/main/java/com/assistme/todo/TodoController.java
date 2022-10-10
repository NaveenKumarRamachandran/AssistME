package com.assistme.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("/create")
    public String saveTodo(@Valid @RequestBody TodoEntity todoEntity) {
        return todoService.saveTodo(todoEntity);
    }

    @GetMapping("/all")
    public List<TodoEntity> getAllTodo() {
        return todoService.getAllTodo();
    }

}
