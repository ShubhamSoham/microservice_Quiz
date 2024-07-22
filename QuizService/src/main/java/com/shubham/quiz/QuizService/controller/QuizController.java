package com.shubham.quiz.QuizService.controller;

import com.shubham.quiz.QuizService.model.Quiz;
import com.shubham.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/all")
    public List<Quiz> getAllQuiz() {

        return quizService.getAllQuiz();
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable int id) {

        return quizService.getQuizById(id);
    }

    @PostMapping("/add")
    public Quiz addQuiz(@RequestBody Quiz quiz) {

        return quizService.addQuiz(quiz);
    }
}
