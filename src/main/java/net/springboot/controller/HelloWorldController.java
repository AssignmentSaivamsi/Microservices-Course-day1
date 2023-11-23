package net.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController


public class HelloWorldController {
	
@GetMapping("/hello-world")
  public String helloworld() {
	return "Hello World!";
	
}

}
