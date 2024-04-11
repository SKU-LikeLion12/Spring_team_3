package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello-data")
    public String helloData(Model model) {
        model.addAttribute("nameKey", "준범");
        return "hello";
    }
    @GetMapping("/hello/{name}")
    public String helloPath(@PathVariable String name, Model model){
        model.addAttribute("nameKey",name);
        return "hello";
    }
    @GetMapping("/hello-param")
    public String helloParam(@RequestParam("name") String name,
                             @RequestParam("age")String age,
                             @RequestParam("grade")String grade,
                             @RequestParam("hob")String hob, Model model){


        model.addAttribute("nameKey",name);
        model.addAttribute("age",age);
        model.addAttribute("grade",grade);
        model.addAttribute("hob",hob);
        return "hello";
    }
}