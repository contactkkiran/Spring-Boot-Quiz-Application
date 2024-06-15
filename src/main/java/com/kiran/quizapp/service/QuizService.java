package com.kiran.quizapp.service;

import com.kiran.quizapp.dao.QuestionDao;
import com.kiran.quizapp.dao.QuizDao;
import com.kiran.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class QuizService {

    QuizDao quizDao;

    @Autowired
    public QuizService(QuizDao quizDao) {
        Assert.notNull(quizDao, "QuestionDao must not be null!");
        this.quizDao = quizDao;
    }


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
//        quiz.
    }
}
