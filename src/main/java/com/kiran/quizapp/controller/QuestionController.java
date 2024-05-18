package com.kiran.quizapp.controller;

import com.kiran.quizapp.Question;
import com.kiran.quizapp.service.QuestionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Quiz API")
@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
//    Get All questions

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){

        return questionService.getAllQuestions();
    }


//    get questions by  category
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){

        return  questionService.getQuestionByCategory(category);
    }

//    Add question

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){

        return questionService.addQuestion(question);
    }
    @PostMapping("delete")
    public void deleteQuestion(@RequestBody Question question){

         questionService.deleteQuestion(question);
    }

}