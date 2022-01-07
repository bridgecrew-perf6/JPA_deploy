package Carl.JPASHOP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/")
    public String Hellowolrd() {
        return "Hello World";
    }
}
