package com.abloz;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 * Created by zhh on 2018/1/8.
 */
@SpringBootApplication(scanBasePackages = "com.abloz")
@ServletComponentScan
@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/b/test")
    @ResponseBody
    String test() {
        return "test b";
    }

    @RequestMapping("/a/test")
    @ResponseBody
    String testa() {
        return "test a!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }
}
