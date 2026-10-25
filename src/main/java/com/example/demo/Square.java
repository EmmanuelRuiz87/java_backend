package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Square {
    @GetMapping("/square")
    public String square(@RequestParam(value = "side", defaultValue = "0") int side){
        int area = side * side;
        int perimeter = side * 4;
        return String.format("Lado = %d<br>área = %d<br>perímetro = %d", side, area, perimeter);
    }
}
