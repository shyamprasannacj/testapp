package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping({
            "/",
            "/hello"
    })
    public String hello(@RequestParam(value = "name", defaultValue = "World", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
