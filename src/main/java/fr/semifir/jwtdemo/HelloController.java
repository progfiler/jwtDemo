package fr.semifir.jwtdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @RequestMapping({"/hello"})
    public String hello() {
        return "Hello world";
    }

    @RequestMapping({"/bye"})
    public String bye() {
        return "bye world";
    }
}

