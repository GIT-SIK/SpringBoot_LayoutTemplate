package com.test.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TilesController {
	
    @GetMapping("/tiles")
    public String t1Mapping() {
        return "index.tiles";
    }
    
//    @GetMapping("/")
//    public String i1Mapping() {
//        return "index";
//    }
}
