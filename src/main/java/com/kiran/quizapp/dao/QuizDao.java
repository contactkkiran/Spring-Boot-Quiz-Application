package com.kiran.quizapp.dao;

import com.kiran.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
QuizDao extends JpaRepository<Quiz, Integer> {
}
