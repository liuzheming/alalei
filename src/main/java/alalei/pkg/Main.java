package alalei.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication
@Configuration
@ComponentScan("alalei.pkg")
public class Main {


    public static void main(String... args) {
        SpringApplication.run(Main.class);
        System.out.println("future start...");
    }

    @RequestMapping("/api")
    public String method() {
        return "null";
    }


}
