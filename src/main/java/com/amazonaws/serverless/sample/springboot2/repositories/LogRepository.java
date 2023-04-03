package com.amazonaws.serverless.sample.springboot2.repositories;

import com.amazonaws.serverless.sample.springboot2.domain.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

    @Override
    List<Log> findAll();
}
