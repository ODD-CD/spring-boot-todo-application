package com.timebomb.spring_boot_todo_application.repositories;

import com.timebomb.spring_boot_todo_application.models.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
