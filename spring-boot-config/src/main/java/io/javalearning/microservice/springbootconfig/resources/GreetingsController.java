package io.javalearning.microservice.springbootconfig.resources;

import io.javalearning.microservice.springbootconfig.config.DBSettings;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DBSettings dbSettings;

    @GetMapping("/greeting")
    private String greetings()
    {
        return dbSettings.getConnection()+dbSettings.getHost()+dbSettings.getPort();
    }
}
