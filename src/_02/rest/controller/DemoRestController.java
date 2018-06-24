package _02.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello world!";
	}
	
}
