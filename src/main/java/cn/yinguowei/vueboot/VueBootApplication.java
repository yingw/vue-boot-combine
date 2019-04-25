package cn.yinguowei.vueboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class VueBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueBootApplication.class, args);
    }
}


@Controller
class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello, Vue!";
    }
}