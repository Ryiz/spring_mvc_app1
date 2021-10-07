package org.ryiz.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ryiz DQiSaF
 */

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
