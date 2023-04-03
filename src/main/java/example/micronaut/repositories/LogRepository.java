package example.micronaut.repositories;

import example.micronaut.domain.Log;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

    @Override
    List<Log> findAll();
}
