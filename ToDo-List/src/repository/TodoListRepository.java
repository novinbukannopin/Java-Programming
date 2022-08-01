package repository;

import entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    void remove(Integer number);

}
