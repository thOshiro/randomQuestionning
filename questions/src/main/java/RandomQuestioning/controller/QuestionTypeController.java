package RandomQuestioning.controller;

import RandomQuestioning.entity.QuestionType;
import RandomQuestioning.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Optional;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class QuestionTypeController {

    @Autowired
    QuestionTypeService questionTypeService;

    Logger log = Logger.getLogger(QuestionTypeController.class.toString());

    @PostMapping("type")
    @ResponseBody
    public Optional<QuestionType> saveQuestionType(@Valid @RequestBody QuestionType questionType){
        log.info("QuestionType: " + questionType.getType());
        return questionTypeService.save(questionType);
    }
}
