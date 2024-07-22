package com.shubham.quiz.QuestionService.repository;

import com.shubham.quiz.QuestionService.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByQuizId(int quizId);
}
