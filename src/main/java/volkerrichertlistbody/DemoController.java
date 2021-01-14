package volkerrichertlistbody;

import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/demo")

public class DemoController {
    @Put("/")
    public List<String> doit(@Body List<String> names) {
        return names;
    }
}