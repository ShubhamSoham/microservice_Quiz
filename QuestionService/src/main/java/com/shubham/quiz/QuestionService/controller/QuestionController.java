package com.shubham.quiz.QuestionService.controller;

import com.shubham.quiz.QuestionService.model.Question;
import com.shubham.quiz.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/getAll")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuiz(@PathVariable int quizId) {
        return questionService.getQuestionsByQuiz(quizId);
    }
}
