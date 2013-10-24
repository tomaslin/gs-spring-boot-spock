package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/reverse/{stringToReverse}")
    public
    @ResponseBody
    String reverse(@PathVariable String stringToReverse) {
        return new StringBuilder(stringToReverse).reverse().toString();
    }

}
