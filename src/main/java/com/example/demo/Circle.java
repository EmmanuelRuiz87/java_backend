package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Circle {
    @GetMapping("/circle")
    public String circle(@RequestParam(value = "radio", defaultValue = "0") int radio) {
        double area = 3.14 * radio * radio;
        double perimeter = 2 * 3.14 * radio;
        return String.format("Radio = %d<br>Área = %f<br>Perímetro = %f", radio, area, perimeter);
    }
}
