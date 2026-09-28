package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/triangle")
	public String lados(@RequestParam(value = "base", defaultValue = "0") int base,
						@RequestParam(value = "height", defaultValue = "0") int height) {
		double area = (base * height) / 2;
		int perimeter = base*3;
		return String.format("Base: %d,  Altura: %d,  Área: %.2f,  Perímetro(equilatero): %d", base, height, area, perimeter);
	}
}
