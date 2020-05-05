package com.greenfoxacademy.exercises.repositories;

import com.greenfoxacademy.exercises.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
