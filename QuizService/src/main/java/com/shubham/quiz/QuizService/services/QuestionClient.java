package com.shubham.quiz.QuizService.services;

import com.shubham.quiz.QuizService.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "QuestionClient")
public interface QuestionClient {

    @GetMapping("/api/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable int quizId);

}
