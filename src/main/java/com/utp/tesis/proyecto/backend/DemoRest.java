package com.utp.tesis.proyecto.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRest {

	@GetMapping("/demoget")
	public String demo() {
		return "Hola mundo";
	}
	
}
