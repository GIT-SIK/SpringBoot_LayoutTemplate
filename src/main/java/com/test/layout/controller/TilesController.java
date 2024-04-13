package com.test.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TilesController {

    @GetMapping("/tiles")
    public String t1Mapping() {
        return "index.tiles";
    }

}
