package com.anushka.wwork.quizApp.controller;

import com.anushka.wwork.quizApp.model.Question;
import com.anushka.wwork.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//This handles the API route:
//When someone goes to localhost:8080/question/allQuestions,
//It calls the getAllQuestions() method from QuestionService
//It returns the list of Question objects as JSON

@RestController
@RequestMapping("questions")//base url path
public class QuestionsController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
       return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
       return questionService.getAllQuestionsByCategory(category);
    }
}
