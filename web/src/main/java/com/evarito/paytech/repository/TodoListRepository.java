package com.evarito.paytech.repository;

import com.evarito.paytech.model.TodoList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository
  extends PagingAndSortingRepository<TodoList, Long> {}
