package com.example.springbootcf.demo.springbootcf;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

 
@RestController
class MessageRestController {
 
    @RequestMapping("/hello")
    String getMessage(@RequestParam(value = "name") String name) {
        String rsp = "Hi " + name + " : responded on - " + new Date();
        System.out.println(rsp);
        return rsp;
    }
}