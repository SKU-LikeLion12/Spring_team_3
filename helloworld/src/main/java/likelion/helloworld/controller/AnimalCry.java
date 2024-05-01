package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class AnimalCry {
    @GetMapping("/hello-jb")
    public String helloParam(@RequestParam(value = "test", required = false,defaultValue = "0") int num,
            @RequestParam("duckcry") String duckcry,
                             @RequestParam("gugucry")String gugucry,
                             @RequestParam("lioncry")String lioncry,
                             @RequestParam("deercry")String deercry, Model model){
        model.addAttribute("duck",duckcry);
        model.addAttribute("gugu",gugucry);
        model.addAttribute("lion",lioncry);
        model.addAttribute("waterdeer",deercry);
        return "HI";
    }
}

