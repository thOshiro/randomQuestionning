package RandomQuestioning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class questionController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
