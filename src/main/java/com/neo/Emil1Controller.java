package com.neo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

class Emil1Controller {

	@GetMapping("/")
	public String root() {
		return "Hello Malmo Sweden! I'm served by " + getClass().getName();
	}

	@GetMapping("hello/{name}")
	public String person(@PathVariable String name) {
		return "Hello " + name + "!";
	}

}
