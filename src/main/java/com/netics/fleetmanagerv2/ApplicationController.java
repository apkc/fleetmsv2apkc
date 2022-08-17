package com.netics.fleetmanagerv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Avishkar Pratap K.C. *
 */
@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home() {
        return "index";
    }


    @GetMapping("/widgets")
    public String widget() {
        return "widgets";
    }
}
