package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Springboot..!!!";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Hello Springboot..!!!";
    }
    
}
