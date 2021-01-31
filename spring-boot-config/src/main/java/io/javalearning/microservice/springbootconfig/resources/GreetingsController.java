package io.javalearning.microservice.springbootconfig.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingsController {

    @Value("${my.greetings: This is default Value}")
    private String greeting;

    @Value("${my.list}")
    private List<String> listValues;

    @Value("#{${dbValues}}")
    private Map<String, String> values;

    @GetMapping("/greeting")
    private String greetings()
    {
        return greeting+listValues+values;
    }
}
