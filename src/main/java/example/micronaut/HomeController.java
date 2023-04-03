package example.micronaut;
import example.micronaut.domain.Log;
import example.micronaut.repositories.LogRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    private final LogRepository logRepository;

    HomeController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Get
    public Map<Long, Object> index() {
        List<Log> log = logRepository.findAll();
        return Collections.singletonMap(log.get(0).getId(), log.get(0).getName());
    }

    @Get("/pathTest/{number}")
    public Map<String, Object> pathTest(@PathVariable Integer number) {
        return Collections.singletonMap("pathNumber", number);
    }
}
