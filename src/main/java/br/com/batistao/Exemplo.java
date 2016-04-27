package br.com.batistao;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ceb on 25/04/16.
 */
@RestController
@EnableAutoConfiguration
public class Exemplo {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Exemplo.class, args);
    }
}
