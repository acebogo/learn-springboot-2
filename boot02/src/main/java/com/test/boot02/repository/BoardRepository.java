package com.test.boot02.repository;

import com.test.boot02.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {


}
