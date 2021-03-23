package hong.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {
    @GetMapping("hello")
    public String demo(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
