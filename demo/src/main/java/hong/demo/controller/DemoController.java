package hong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    // get /hello 로 들어왔을때
    @GetMapping("hello")
    public String demo(Model model){
        model.addAttribute("data", "hello!!");
        // return : resources/templates 에서 hello.html을 찾아서 보여줌
        return "hello";
    }
}
