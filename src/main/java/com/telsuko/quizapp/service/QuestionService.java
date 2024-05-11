package com.telsuko.quizapp.service;

import com.telsuko.quizapp.Question;
import com.telsuko.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public  class QuestionService {
    @Autowired
    QuestionDao questiondao;
    public List<Question> getAllQuestions() {

        return questiondao.findAll();
    }


    public List<Question> getQuestionByCategory(String category) {

        return questiondao.findByCategory(category);
    }


    public String addQuestion(Question question) {
        questiondao.save(question);
         return "Success";
    }


    public void deleteQuestion(Question question) {
         questiondao.delete(question);
    }
}


