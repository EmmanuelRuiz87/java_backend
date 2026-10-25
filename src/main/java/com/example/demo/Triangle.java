package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Triangle {

    @GetMapping("/triangle")
    public String triangle(@RequestParam(value = "base", defaultValue = "0") int base,
                           @RequestParam(value = "height", defaultValue = "0")int height) {
        double area = (base * height) / 2.0;
        int perimeter = base * 3;

        return String.format(
                "<h1>Triángulo</h1>Base: %d<br>Altura: %d<br>Área: %.2f<br>Perímetro (equilatero): %d",
                base, height, area, perimeter);
    }

}
