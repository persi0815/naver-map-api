package com.example.navermapapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping ("/test")
    public String mapTest(){
        return "index.html";
    }
}
