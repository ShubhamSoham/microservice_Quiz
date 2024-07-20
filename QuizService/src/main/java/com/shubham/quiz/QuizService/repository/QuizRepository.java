package com.shubham.quiz.QuizService.repository;

import com.shubham.quiz.QuizService.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
